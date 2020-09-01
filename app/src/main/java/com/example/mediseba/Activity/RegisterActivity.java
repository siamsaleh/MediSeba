package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mediseba.R;

public class RegisterActivity extends AppCompatActivity {


    private EditText username_editText, password_editText, gender_editText, age_editText, mobile_editText;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username_editText = findViewById(R.id.userName_register);
        password_editText = findViewById(R.id.password_register);
        gender_editText = findViewById(R.id.gender_register);
        age_editText = findViewById(R.id.age_Edit_Register);
        mobile_editText = findViewById(R.id.phone_edit_register);

        register = findViewById(R.id.register);

    }
}
