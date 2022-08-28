package com.example.recviewpractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Contact c1 = new Contact(1,"Hamro","23536873667");
    Contact c2 = new Contact(2,"Nepal","3463247658");
    Contact c3 = new Contact(3,"Apple","423546546546");
    Contact c4 = new Contact(4,"Mantos","4354365467");
    Contact c5 = new Contact(5,"Dhunga","4753567987");
    Contact c6 = new Contact(6,"Hanuman","6546545366");
    Contact c7 = new Contact(7,"dadad","6546545366");
    Contact c8 = new Contact(8,"dasfasf","6546545366");
    Contact c9 = new Contact(9,"fsfsf","6546545366");

    Contact [] contacts = {c1,c2,c3,c4,c5,c6,c7,c8,c9};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }


}