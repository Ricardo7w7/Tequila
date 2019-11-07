package com.example.tequila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textBienvenida;
    ImageButton imgLibro;
    Button btnProfile, btnConfig, btnLibro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setTitle("Buscar");

        Bundle extras = getIntent().getExtras();
        String Usuario = extras.getString("valorMatricula");

        textBienvenida = findViewById(R.id.textViewBuscar);
        textBienvenida.setText("Tu matricula: " + Usuario);

        btnProfile = findViewById(R.id.buttonPerfil);
        btnConfig = findViewById(R.id.buttonConfiguracion);
        btnLibro = findViewById(R.id.buttonLibro);

        btnProfile.setOnClickListener(this);
        btnLibro.setOnClickListener(this);
        btnConfig.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttonPerfil){
            Intent intentProfile = new Intent(this, ProfileActivity.class);
            startActivity(intentProfile);
        } else if (view.getId() == R.id.buttonConfiguracion){
            Intent intentConfiguration = new Intent(this, ConfigurationActivity.class);
            startActivity(intentConfiguration);
        } else if (view.getId() == R.id.buttonLibro) {
            Intent intentBook = new Intent (this, LibroActivity.class);
            startActivity(intentBook);
        }



    }
}
