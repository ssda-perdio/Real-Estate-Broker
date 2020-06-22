package com.example.realestatebroker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.realestatebroker.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Signup();
            }
        });

    }

    public void Signup() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}