package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mediseba.Adapter.HomeGridAdapter;
import com.example.mediseba.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

//    private Button ambulanceButton;
//    private GridView gridView;
//    private int [] pics = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
//    private String[] items;

    private int[] imageSlide = {R.drawable.hotline,R.drawable.hotline,R.drawable.hotline,R.drawable.hotline};

    private Button doctorButton, appointmentButton, medicine_button, ambulance_button, homeCheckUpButton, disTestButton;
    private ImageView callCenterImage, emergencyCallButton, homeImage, profileImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        gridView = findViewById(R.id.gridView_HomePage);
//        items = getResources().getStringArray(R.array.gridView_homePage);
//
//        HomeGridAdapter adapter = new HomeGridAdapter(this, items, pics);
//        gridView.setAdapter(adapter);
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String nameOfType = items[position];
////                Toast.makeText(MainActivity.this, nameOfType, Toast.LENGTH_SHORT).show();
//                if (nameOfType.equals("Corona Virus")){
//                    Intent intent = new Intent(MainActivity.this, DoctorListActivity.class);
//                    intent.putExtra("doctorType", nameOfType);
//                    startActivity(intent);
//                }
//            }
//        });

//        findViewById(R.id.button_ambulance).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,AmbulanceActivity.class));
//            }
//        });

        doctorButton = findViewById(R.id.home_doctor_Button);
        appointmentButton = findViewById(R.id.home_appointment_Button);
        ambulance_button = findViewById(R.id.home_ambulance_Button);
        medicine_button = findViewById(R.id.home_medicine_Button);
        homeCheckUpButton = findViewById(R.id.home_check_up_Button);
        disTestButton = findViewById(R.id.home_dis_test_Button);

        doctorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DoctorCetegoryActivity.class));
            }
        });

        appointmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DoctorCetegoryActivity.class));
            }
        });

        ambulance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AmbulanceActivity.class));
            }
        });

        medicine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DoctorCetegoryActivity.class));
            }
        });

        homeCheckUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DoctorCetegoryActivity.class));
            }
        });

        disTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestDisActivity.class));
            }
        });



        CarouselView carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(imageSlide.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(imageSlide[position]);
            }
        });

        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
            }
        });




    }

}
