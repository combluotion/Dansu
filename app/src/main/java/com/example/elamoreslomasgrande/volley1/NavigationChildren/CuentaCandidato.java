package com.example.elamoreslomasgrande.volley1.NavigationChildren;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.elamoreslomasgrande.volley1.Navigation.Navigation;
import com.example.elamoreslomasgrande.volley1.R;

public class CuentaCandidato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_candidato);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void cambiarPass(View view){
        Intent intentDarBaja = new Intent(CuentaCandidato.this,CambiarPass.class);
        startActivity(intentDarBaja);
    }

    public void goBaja(View view){
        Intent intentDarBaja = new Intent(CuentaCandidato.this,DarseBaja.class);
        startActivity(intentDarBaja);
    }
}
