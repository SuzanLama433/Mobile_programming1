package com.example.faculty_form;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class listview_backend extends AppCompatActivity {

    ListView lts1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        lts1 = findViewById(R.id.listview1);
        int [] messi_img = {R.drawable.messi, R.drawable.res};
        String [] name = {"Messi","hi"};
        String [] club = {"Barca","sujan"};
        String [] cup ={"world cup","hello"};
        list_adapter adapter = new list_adapter(this, messi_img,name,club,cup);
        lts1.setAdapter(adapter);
    }

}
