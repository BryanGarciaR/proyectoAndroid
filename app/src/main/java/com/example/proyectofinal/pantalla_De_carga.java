package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pantalla_De_carga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla_de_carga);
         int Tiempo = 4000;

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 startActivity(new Intent(pantalla_De_carga.this, MainActivity.class));
                 finish();
             }
         },Tiempo);
    }
}