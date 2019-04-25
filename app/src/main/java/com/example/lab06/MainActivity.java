package com.example.lab06;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import data.LabDatabase;

public class MainActivity extends AppCompatActivity {

    private Button submitBtn;
    private Button listBtn;
    private EditText nameTxt;
    private LabDatabase labDB;
    private String DATABASE_NAME = "database";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn = findViewById(R.id.submitBtn);
        listBtn = findViewById(R.id.listBtn);
        nameTxt = findViewById(R.id.nameTxt);

        labDB = Room.databaseBuilder(this, LabDatabase.class, DATABASE_NAME)
                .build();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameTxt.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This is working!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}
