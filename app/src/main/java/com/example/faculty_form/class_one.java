package com.example.faculty_form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class class_one extends Activity {
    Button btn1; TextView Id ,name , address;

    RadioButton button_male,button_female;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_one);
        btn1 = findViewById(R.id.submit1);
        Id = findViewById(R.id.Id1);
        name = findViewById(R.id.name11);
        address = findViewById(R.id.address11);
        button_male = findViewById(R.id.button_male);
        button_female = findViewById(R.id.button_female);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Data successfully pass",Toast.LENGTH_LONG).show();
                String ID = Id.getText().toString();
                String Name = name.getText().toString();
                String Address = address.getText().toString();
                String Gender = "";
                  if (button_male.isChecked()){
                      Gender = "Male";
                  }
                  else{
                      Gender = "Female";
                  }

                Intent intent = new Intent(class_one.this, class_two.class) ;
                  intent.putExtra("ID", ID);
                  intent.putExtra("Name", Name);
                  intent.putExtra("Address",Address );
                  intent.putExtra("Gender", Gender);
                  startActivity(intent);
            }
        });

    }
}
