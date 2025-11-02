package com.example.faculty_form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class class_two extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_two);
        Intent intent = getIntent();
        String ID = intent.getStringExtra("ID");
        String Name = intent.getStringExtra("Name");
        String Address = intent.getStringExtra("Address");
        String Gender = intent.getStringExtra("Gender");
        TextView text = findViewById(R.id.textview11);
        String info = getString(R.string.user_details, ID, Name, Address, Gender);
        text.setText(info);

    }
}
