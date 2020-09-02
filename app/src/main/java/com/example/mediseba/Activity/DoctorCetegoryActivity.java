package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mediseba.R;

public class DoctorCetegoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_cetegory);

        findViewById(R.id.covid_doctor_Button).setOnClickListener(new View.OnClickListener() {         //covid
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "covid");
                startActivity(intent);
            }
        });

        findViewById(R.id.skin_doctor_Button).setOnClickListener(new View.OnClickListener() {         //skin
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "skin");
                startActivity(intent);
            }
        });

        findViewById(R.id.medicine_doctor_Button).setOnClickListener(new View.OnClickListener() {      //medicine
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "medicine");
                startActivity(intent);
            }
        });

        findViewById(R.id.surgery_doctor_Button).setOnClickListener(new View.OnClickListener() {      //surgery
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "surgery");
                startActivity(intent);
            }
        });

        findViewById(R.id.eye_doctor_Button).setOnClickListener(new View.OnClickListener() {        //eye
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "eye");
                startActivity(intent);
            }
        });

        findViewById(R.id.dentist_doctor_Button).setOnClickListener(new View.OnClickListener() {    //dentist
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "dentist");
                startActivity(intent);
            }
        });

        findViewById(R.id.chest_doctor_Button).setOnClickListener(new View.OnClickListener() {      //chest
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "chest");
                startActivity(intent);
            }
        });

        findViewById(R.id.brain_doctor_Button).setOnClickListener(new View.OnClickListener() {        //brain
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "brain");
                startActivity(intent);
            }
        });

        findViewById(R.id.bones_doctor_Button).setOnClickListener(new View.OnClickListener() {      //bones
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "bones");
                startActivity(intent);
            }
        });

        findViewById(R.id.child_doctor_Button).setOnClickListener(new View.OnClickListener() {      //child
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorCetegoryActivity.this, DoctorListActivity.class);
                intent.putExtra("doctorType", "child");
                startActivity(intent);
            }
        });

        findViewById(R.id.backButton_doctor_category).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        findViewById(R.id.homeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorCetegoryActivity.this, MainActivity.class));
                finish();
            }
        });
//
//        findViewById(R.id.covid_doctor_Button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        findViewById(R.id.covid_doctor_Button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
