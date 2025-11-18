package com.example.faculty_form;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class gridview_backed extends AppCompatActivity {
    GridView grid1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);
        grid1 = findViewById(R.id.gridview1);
        int [] messi_img = {R.drawable.messi, R.drawable.res};
        String [] name = {"leo", "messi"};
        String [] club = {"Barca", "gf"};
        String [] cup ={"world cup","ggg"};

        gridviewAdapter_backed adapter = new gridviewAdapter_backed(this, messi_img,name,club,cup);
        grid1.setAdapter(adapter);
        grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int click_image = adapter.messi_img[position];
                String st = adapter.name[position];
                String st1 = adapter.club[position];
                String st2 = adapter.cup[position];
                if (position==0){
                    Toast.makeText(gridview_backed.this, "messi", Toast.LENGTH_SHORT).show();

                }

            }

        });
    }
}
