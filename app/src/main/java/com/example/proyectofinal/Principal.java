package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        // Hacer que la aplicación esté en pantalla completa
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Configurar la visibilidad de las barras del sistema
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        // Obtener referencia al botón "Salir"
        Button btnSalir = findViewById(R.id.btnSalir);




        // Agregar listener para manejar el clic en el botón salir
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, MainActivity.class);
                startActivity(intent);

                // Cambiar el color de la barra de estado al color #260AC8
                // Asegúrate de que este método exista en tu contexto



            }

        });

        Button btnAgregarNota = findViewById(R.id.btnAgregarNotas);

        btnAgregarNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(Principal.this, AgregarNota.class);
                startActivity(intent);
            }
        });
    }
}
