package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mediseba.R;

public class RegisterActivity extends AppCompatActivity {


    private EditText name, password, gender_editText, age_editText, mobile_editText,address,number;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name  = findViewById(R.id.userName_register);
        password = findViewById(R.id.password_register);
        address = findViewById(R.id.gender_register);
        age_editText = findViewById(R.id.age_Edit_Register);
        number = findViewById(R.id.phone_edit_register);
        register = findViewById(R.id.register);

    }
}
