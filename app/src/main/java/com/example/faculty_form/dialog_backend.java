package com.example.faculty_form;
import android.app.AlertDialog;
import android.app.AppComponentFactory;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class dialog_backend extends AppCompatActivity {
    Button btn1; TextView txt1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        btn1 = findViewById(R.id.click_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext()," clicked",Toast.LENGTH_SHORT).show();
                showDialog();
            }
        });

        }
    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(dialog_backend.this);
        builder.setTitle("Exit app");
        builder.setView(R.layout.dialogscreen);
        builder.show();
//        builder.setCancelable(true);
//        AlertDialog.Builder builder1 = builder.setView(R.layout.dialogscreen);
//        AlertDialog show = builder.show();
    }
}
