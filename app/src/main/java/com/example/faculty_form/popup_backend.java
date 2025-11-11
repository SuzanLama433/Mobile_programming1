package com.example.faculty_form;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class popup_backend extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_menu);

        textView=findViewById(R.id.popup1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popmenu();
            }
        });

    }

    private void popmenu(){
        PopupMenu popupMenu=new PopupMenu(this,textView);
        popupMenu.getMenuInflater().inflate(R.menu.sujan_dai,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if (id==R.id.edit12){
                    Toast.makeText(getApplicationContext(),"Edit clicked!!",Toast.LENGTH_SHORT).show();
                } else if (id==R.id.Del1) {
                    Toast.makeText(getApplicationContext(),"Delete clicked!!",Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(),"copy clicked",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        popupMenu.show();
    }
}