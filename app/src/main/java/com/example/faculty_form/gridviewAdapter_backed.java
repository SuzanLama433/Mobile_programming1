package com.example.faculty_form;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class gridviewAdapter_backed extends ArrayAdapter<String> {
    ImageView imageView;
    TextView txt1, txt2, txt3;
    Activity context;
    int[] messi_img;
    String [] name;
    String[] club;
    String[] cup;
    public gridviewAdapter_backed (Activity context, int[] messi_img,String [] name, String[] club, String[] cup) {
        super(context, R.layout.listitem, club);
        this.context = context;
        this.messi_img = messi_img;
        this.name = name;
        this.club = club;
        this.cup = cup;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowview = layoutInflater.inflate(R.layout.listitem, null, true);
        imageView = rowview.findViewById(R.id.messi1);
        txt1 = rowview.findViewById(R.id.id1);
        txt2 = rowview.findViewById(R.id.id2);
        txt3 = rowview.findViewById(R.id.id3);
//        Button magicBtn = rowview.findViewById(R.id.magic);
        imageView.setImageResource(messi_img[position]);
        txt1.setText(name[position]);
        txt2.setText(club[position]);
        txt3.setText(cup[position]);
//        magicBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context.getApplicationContext(),"won the World Cup in 2022",Toast.LENGTH_LONG).show();
//            }
//        });

        return rowview;
    }
}
