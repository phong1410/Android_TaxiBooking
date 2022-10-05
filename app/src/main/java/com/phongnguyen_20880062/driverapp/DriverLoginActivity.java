package com.phongnguyen_20880062.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DriverLoginActivity extends AppCompatActivity {
    private EditText nEmail, nPassword;
    private Button nLogin, nRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        nEmail = (EditText) findViewById(R.id.email);
        nPassword = (EditText) findViewById(R.id.password);

        nLogin = (Button) findViewById(R.id.login);
        nRegistration = (Button) findViewById(R.id.registration);
    }
}