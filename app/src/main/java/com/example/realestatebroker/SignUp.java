package com.example.realestatebroker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.realestatebroker.ui.login.LoginActivity;

public class SignUp extends AppCompatActivity {
    private Button signupp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signupp = (Button) findViewById(R.id.signupp);
        signupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checkDataEntered();
                Time today = new Time(Time.getCurrentTimezone());
                today.setToNow();
                Toast.makeText(getApplicationContext(),"Log in to your account",Toast.LENGTH_SHORT).show();
                Login();
            }
        });
    }

    private void checkDataEntered() {
        //mohsens code
    }

    public void Login() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}