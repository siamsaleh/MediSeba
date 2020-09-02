package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.mediseba.R;

public class DocOrPesActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_or_pes);

        radioGroup = findViewById(R.id.radioGroup);



        findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                radioButton.getText();
                Toast.makeText(DocOrPesActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                if (radioButton.getText().equals("Patient")){
                    startActivity(new Intent(DocOrPesActivity.this, LogInActivity.class));
                }
                else {
                    startActivity(new Intent(DocOrPesActivity.this, DocCodeActivity.class));
                }

            }
        });

    }


    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
//        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(),
//                Toast.LENGTH_SHORT).show();
    }

}
