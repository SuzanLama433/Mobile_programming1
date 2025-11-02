package com.example.faculty_form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class second_Backend extends Activity {
    Button submit_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        submit_btn= findViewById(R.id.click_button);


        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"one to another activity",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(second_Backend.this, backend.class) ;
                startActivity(intent);

            }
        });
    }
}
