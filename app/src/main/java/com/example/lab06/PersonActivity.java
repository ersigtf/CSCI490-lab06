package com.example.lab06;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PersonActivity extends AppCompatActivity {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persons);
        listview = findViewById(R.id.personName);
        ArrayList<String> i = (ArrayList) this.getIntent().getExtras().get("Persons");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, i);
        listview.setAdapter(adapter);
    }
}
