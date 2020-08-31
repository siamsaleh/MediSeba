package com.example.mediseba.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mediseba.Adapter.AmbulanceAdapter;
import com.example.mediseba.R;

public class AmbulanceActivity extends AppCompatActivity {
    
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String [] phnNum = {"01716546564", "01756135485", "01713260042", "01925136709", "01707998822", "01819327070"};
    private String [] name = {"Jony Ambulance Service", "Alamgir Ambulance", "Shadman Ambulance Service", "Jony Ambulance Service", "Chittagong Ambulance Service", "Alif Service"};
    private String [] district = {"Dhaka", "Dhaka", "Dhaka", "Chittagong", "Chittagong", "Chittagong"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        recyclerView = findViewById(R.id.ambulance_recyclerView);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        adapter = new AmbulanceAdapter(getApplicationContext(), name, phnNum, district);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

    }

}
