package com.example.tequila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ConfigurationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        setTitle("Configuración");
    }
}
