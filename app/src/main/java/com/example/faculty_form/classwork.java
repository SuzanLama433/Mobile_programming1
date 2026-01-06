package com.example.faculty_form;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class classwork extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        EditText id , name , address;
        Button btn1 , btn2 , btn3 , btn4;
        TextView display ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classwork);
        id = findViewById(R.id.id01);
        name = findViewById(R.id.name01);
        address = findViewById(R.id.address01);
        btn1 = findViewById(R.id.insert1);
        btn2 = findViewById(R.id.select1);
        btn3 = findViewById(R.id.update1);
        btn4 = findViewById(R.id.delete1);
        display = findViewById(R.id.display01);

        //click listener for btn 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //click listener for btn 2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //click listener for btn 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //click listener for btn 4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
