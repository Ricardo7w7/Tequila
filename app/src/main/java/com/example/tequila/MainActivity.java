package com.example.tequila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin, btnRegister;
    EditText editTextMatricula, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        btnRegister = findViewById(R.id.buttonRegister);
        editTextMatricula = findViewById(R.id.editTextMatricula);
        editTextPassword = findViewById(R.id.editTextPassword);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String matricula = editTextMatricula.getText().toString();
        String pass = editTextPassword.getText().toString();

        if(matricula.isEmpty()) {
            editTextMatricula.setError("Ingrese Matricula");
        }
        if(pass.isEmpty()){
            editTextPassword.setError("Ingrese contraseña");
        }
        else {
            Intent intentLogin = new Intent(this, HomeActivity.class);
            intentLogin.putExtra("valorMatricula", matricula);
            startActivity(intentLogin);
        }
    }
}
