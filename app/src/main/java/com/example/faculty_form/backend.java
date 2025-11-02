package com.example.faculty_form;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class backend extends Activity {
    EditText edit_name,edit_address, edit_phone;
    RadioButton button_male,button_female,button_other;

    CheckBox check_football,check_cricket;
    Spinner faculty_items;
    Button button_submit;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        edit_name = findViewById(R.id.edit_name);
        edit_address = findViewById(R.id.edit_address);
        edit_phone = findViewById(R.id.edit_phone);
        button_male = findViewById(R.id.button_male);
        button_female = findViewById(R.id.button_female);
        button_other = findViewById(R.id.button_other);
        check_cricket = findViewById(R.id.check_cricket);
        check_football = findViewById(R.id.check_football);
        faculty_items = findViewById(R.id.faculty_items);
        button_submit = findViewById(R.id.button_submit);

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Succesfully Submit",Toast.LENGTH_LONG).show();
            }
        });
    }
}