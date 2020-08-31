package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mediseba.R;

public class DoctorListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        Intent intent = getIntent();
        String doctorType = intent.getStringExtra("doctorType");
        Toast.makeText(this, doctorType, Toast.LENGTH_SHORT).show();

    }
}
