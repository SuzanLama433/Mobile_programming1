package com.example.faculty_form;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class recycle_adapter extends RecyclerView.Adapter<recycle_adapter.ViewHolder> {
    Activity context;
    String[] name;
    String[] address;
    int[] img;

    public recycle_adapter(  Activity context,String[] name, String[] address, int[] img) {
        this.context = context;
        this.name = name;
        this.address = address;
        this.img = img;
    }

    @NonNull
    @Override
    public recycle_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View ListItem = layoutInflater.inflate(R.layout.recycle_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(ListItem);
        return  viewHolder;
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull recycle_adapter.ViewHolder holder, int position) {
        holder.txt1.setText(name[position]);
        holder.txt2.setText(address[position]);
        holder.imageView.setImageResource(img[position]);


    }

    @Override
    public int getItemCount() {
        return name.length;
    }
    public static  class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txt1, txt2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.messigoat1);
            txt1 = itemView.findViewById(R.id.txtmessi1);
            txt2 = itemView.findViewById(R.id.txtmessi2);
        }
    };
}
