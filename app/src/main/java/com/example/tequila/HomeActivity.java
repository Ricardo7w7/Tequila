package com.example.tequila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textBienvenida;

    Button btnProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extras = getIntent().getExtras();
        String Usuario = extras.getString("valorMatricula");

        textBienvenida = findViewById(R.id.textViewBuscar);
        textBienvenida.setText("Bienvenido alumno con matricula " + Usuario);

        btnProfile = findViewById(R.id.buttonPerfil);
        btnProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        Intent intentProfile = new Intent(this, ProfileActivity.class);
        startActivity(intentProfile);

    }
}
