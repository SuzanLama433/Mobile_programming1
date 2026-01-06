package com.example.faculty_form;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class recycle_backend extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);
        recyclerView = findViewById(R.id.recycle10);
        String[] name = {
                "Ram", "hari ", "Sita"};
        String [] address = {
                "Lalitpur", "Kathmandu ", "pokhara"};
        int[] img = {
                R.drawable.messi,
                R.drawable.res,
                R.drawable.ic_launcher_foreground};
        layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new recycle_adapter(this,name,address,img);
        recyclerView.setAdapter(adapter);
    }
}
