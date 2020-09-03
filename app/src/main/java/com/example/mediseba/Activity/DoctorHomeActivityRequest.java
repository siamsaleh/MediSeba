package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mediseba.R;

public class DoctorHomeActivityRequest extends AppCompatActivity {

    TextView appointment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home_request);

        appointment = findViewById(R.id.TextAppointment_req);
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorHomeActivityRequest.this, DoctorHomeActivityAppointment.class));
            }
        });

    }
}
