package com.example.mediseba.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mediseba.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class RegisterActivity extends AppCompatActivity {


    private EditText name, password, gender_editText, age_editText, mobile_editText,address,number,email;
    private Button register,signup;
    DatabaseReference databaseReference;
    private FirebaseAuth mAuth;
    FirebaseFirestore firebaseFirestore;
    String uid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name  = findViewById(R.id.userName_register);
        password = findViewById(R.id.password_register);
        address = findViewById(R.id.gender_register);
        age_editText = findViewById(R.id.age_Edit_Register);
        number = findViewById(R.id.phone_edit_register);
        signup = findViewById(R.id.register);
        email = findViewById(R.id.userEmail_register);
        mAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        final String mail = email.getText().toString();
        final String pass = password.getText().toString();
        final String nameBar = name.getText().toString();
        final String phone =number.getText().toString();
        final String address2 = address.getText().toString();
        final int p = Integer.parseInt(phone);

        if(mail.isEmpty()){
            email.setError("Enter mail");
            email.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
            email.setError("Enter proper mail");
            email.requestFocus();
            return;
        }
        if(pass.isEmpty() || pass.length() < 6){
            password.setError("Proper Pass");
            password.requestFocus();
            return;
        }
        //  final Doner doner = new Doner(nameBar,jelaBAr,blood[0],p);
        final User Dprofile = new User(nameBar, address2, mail, p);

        mAuth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                //  p.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    uid = mAuth.getCurrentUser().getUid();
                    DocumentReference documentReference = firebaseFirestore.collection("users").document(uid);
                    documentReference.set(Dprofile).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(getApplicationContext(),"Succefull", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(),"Data input Not Succefull"+e,Toast.LENGTH_SHORT).show();
                        }
                    });

                    finish();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    // intent.putExtra(MainActivity.EMAIL,pass);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),"NOt Succefull",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
