package com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.ContactsAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Saugat Malla", "988011122", R.drawable.saugat));
        contactList.add(new Contact("Rajesh Hamal", "980983445", R.drawable.rajesh));
        contactList.add(new Contact("Dayahang Rai", "982329399", R.drawable.dahayang));
        contactList.add(new Contact("Bhuwan Kc", "9813233434", R.drawable.bhuwan));


        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}
