 package com.example.mediseba.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mediseba.R;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestDisActivity extends AppCompatActivity {

    private EditText to, subject, Smassage;
    private Button send;
    private ImageView backButton;
    String sEmail, sPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dis);

//        to = findViewById(R.id.editText);
        subject = findViewById(R.id.editText2);
        Smassage = findViewById(R.id.editText3);
        send = findViewById(R.id.submit_Email_Button);
        backButton = findViewById(R.id.backButton_test_Dis);

        //sender email credential
        sEmail = "Tdoc3604@gmail.com";
        sPassword = "19521971";

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Properties properties = new Properties();
                properties.put("mail.smtp.auth", "true");
                properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host", "smtp.gmail.com");
                properties.put("mail.smtp.port", "587");

                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(sEmail, sPassword);
                    }
                });


                try {
                    //email Content
                    Message message = new MimeMessage(session);

                    //sender Email
                    message.setFrom(new InternetAddress(sEmail));

                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse("siamsaleh9@gmail.com"));//to.getText().toString().trim()

                    message.setSubject(subject.getText().toString().trim());

                    message.setText(Smassage.getText().toString().trim());

                    //send Email
                    new SendMail().execute(message);

                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private class SendMail extends AsyncTask<Message, String, String> {

        //Initialize progress dialog
        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(TestDisActivity.this,
                    "Please Wait", "Sending Mail...", true, false);
        }

        @Override
        protected String doInBackground(Message... messages) {
            try {
                //when Success
                Transport.send(messages[0]);
                return "Success";
            } catch (MessagingException e) {
                e.printStackTrace();

                return "Error";
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressDialog.dismiss();;
            if (s.equals("Success")){
                AlertDialog.Builder builder = new AlertDialog.Builder(TestDisActivity.this);
                builder.setCancelable(false);
                builder.setTitle(Html.fromHtml("<font color='#509324'>Success</font>"));
                builder.setMessage("We received your request. We will sent a person who will collect your sample.");//Mail send Successfully
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        onBackPressed();
                        finish();
                    }
                });
                builder.show();
            }
            else {
                Toast.makeText(TestDisActivity.this, "Something went Wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
