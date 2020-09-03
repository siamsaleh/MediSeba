package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mediseba.R;

public class DoctorHomeActivityAppointment extends AppCompatActivity {

    private TextView request;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home_appointment);

        request = findViewById(R.id.TextRequest_app);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorHomeActivityAppointment.this, DoctorHomeActivityRequest.class));
            }
        });


    }
}
