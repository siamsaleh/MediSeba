package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mediseba.R;

public class LogInActivity extends AppCompatActivity {

    private EditText username_editText, password_editText;
    private Button login;
    private TextView register_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        login = findViewById(R.id.login);
        username_editText = findViewById(R.id.editText2);
        password_editText = findViewById(R.id.editText);

        register_account = findViewById(R.id.signinActivity_Text);

        register_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this, RegisterActivity.class));
            }
        });

    }
}
