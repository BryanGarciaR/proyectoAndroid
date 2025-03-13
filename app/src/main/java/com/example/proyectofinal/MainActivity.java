package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Pintar la barra de estado de color blue
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        // Hacer que la aplicación esté en pantalla completa
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Configurar la visibilidad de las barras del sistema
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        // Obtener referencia al botón "INICIAR SESIÓN"
        Button btnIniciarSesion = findViewById(R.id.btn_iniciar_sesion);

        // Agregar listener para manejar el clic en el botón
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ingreso.class);
                startActivity(intent);
            }
        });

        // Obtener referencia al botón "REGISTRARSE"
        Button btnRegistrarse = findViewById(R.id.btnRegistrarse);

        // Agregar listener para manejar el clic en el botón
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la vista de registro
                Intent intent = new Intent(MainActivity.this, registro.class);
                startActivity(intent);
            }
        });

        // Ajustar el padding según las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_iniciar_sesion), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
