package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.mediseba.Adapter.HomeGridAdapter;
import com.example.mediseba.R;

public class MainActivity extends AppCompatActivity {

    private Button ambulanceButton;
    private GridView gridView;
    private int [] pics = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    private String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView_HomePage);
        items = getResources().getStringArray(R.array.gridView_homePage);

        HomeGridAdapter adapter = new HomeGridAdapter(this, items, pics);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nameOfType = items[position];
//                Toast.makeText(MainActivity.this, nameOfType, Toast.LENGTH_SHORT).show();
                if (nameOfType.equals("Corona Virus")){
                    Intent intent = new Intent(MainActivity.this, DoctorListActivity.class);
                    intent.putExtra("doctorType", nameOfType);
                    startActivity(intent);
                }
            }
        });

        findViewById(R.id.button_ambulance).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AmbulanceActivity.class));
            }
        });

    }
}
