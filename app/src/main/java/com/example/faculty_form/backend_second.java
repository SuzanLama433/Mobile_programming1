package com.example.faculty_form;

import android.app.Activity;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class backend_second extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_two);
        Intent intent = getIntent();

        int id = intent.getIntExtra("id", 0);
        String name = intent.getStringExtra("Name");
        String address = intent.getStringExtra("Address");

        TextView text = findViewById(R.id.textview1);
        text.setText("id="+id +"\n"+ "name"+name+"\n"+"Address="+ address);

    }
}
