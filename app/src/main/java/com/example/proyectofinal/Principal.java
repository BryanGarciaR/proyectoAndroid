package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
