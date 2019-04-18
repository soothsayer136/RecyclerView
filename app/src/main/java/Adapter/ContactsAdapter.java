package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.recyclerview.Contact;
import com.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mcontext;
    List<Contact> contactList;

    public ContactsAdapter(Context mcontext, List<Contact> contactList) {
        this.mcontext = mcontext;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contact,viewGroup,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
            Contact contacts = contactList.get(i);
            contactsViewHolder.imgCircle.setImageResource( contacts.getImageId());
            contactsViewHolder.tvName.setText(contacts.getName());
            contactsViewHolder.tvPhone.setText(contacts.getPhoneNo());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgCircle;
        TextView tvName, tvPhone;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCircle = itemView.findViewById(R.id.imgCircle);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }



    }



}
