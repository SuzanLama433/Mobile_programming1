package com.example.faculty_form;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class googlemap_backend extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap gm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.google_maps);
        SupportMapFragment smf = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.googlemaps);
        smf.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        gm = googleMap;
        LatLng loc = new LatLng(27.6, 83.4);
        gm.addMarker(new MarkerOptions().position(loc).title("Home"));
        gm.moveCamera(CameraUpdateFactory.newLatLng(loc));
        gm.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 9f));
    }
}