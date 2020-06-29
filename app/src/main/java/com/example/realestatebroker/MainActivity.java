package com.example.realestatebroker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.realestatebroker.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    public Button signup;
    public EditText Firstname;
    public EditText Lastname;
    public EditText email;
    public EditText phone;
    public EditText sucpass;
    public EditText supass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Firstname = findViewById(R.id.fname);
        Lastname = findViewById(R.id.lname);
        email = findViewById(R.id.email);
        supass = findViewById(R.id.supass);
        sucpass = findViewById(R.id.sucpass);
        phone = findViewById(R.id.phone);

    }
}