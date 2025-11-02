package com.example.faculty_form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class backend_first extends Activity {
    Button button_submit1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_one);
        button_submit1= findViewById(R.id.button_submit1);

        button_submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Data successfully pass",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(backend_first.this, backend_second.class) ;
                intent.putExtra("id",1);
                intent.putExtra("Name","Sujan lama");
                intent.putExtra("Address", "lalitpur");
                startActivity(intent);
            }
        });
    }
}
