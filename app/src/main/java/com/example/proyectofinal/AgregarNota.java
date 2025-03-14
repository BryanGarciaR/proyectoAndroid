package com.example.proyectofinal;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AgregarNota extends AppCompatActivity {

    private TextView txtFecha2;
    private TextView txtFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agregarnota);

        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));
        // Hacer que la aplicación esté en pantalla completa
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Configurar la visibilidad de las barras del sistema
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        // Obtener el TextView y el Button
        txtFecha2 = findViewById(R.id.txtFecha2);
        Button btnCalendario = findViewById(R.id.btnCalendario);
        txtFecha = findViewById(R.id.txtFecha);
        // Obtener la fecha actual y establecerla en el TextView
        String fechaActual = obtenerFechaActual();
        txtFecha.setText(fechaActual);

        // Configurar el botón para mostrar el calendario
        btnCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarCalendario();
            }
        });
    }

    // Método para obtener la fecha actual
    private String obtenerFechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return sdf.format(new Date());
    }

    // Método para mostrar el DatePickerDialog
    private void mostrarCalendario() {
        // Obtener la fecha actual
        final Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH);
        int año = calendar.get(Calendar.YEAR);

        // Crear el DatePickerDialog
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
            // Formatear la fecha seleccionada
            String fechaSeleccionada = String.format(Locale.getDefault(), "%02d/%02d/%d", dayOfMonth, month + 1, year);
            // Establecer la fecha seleccionada en el TextView
            txtFecha2.setText(fechaSeleccionada);
        }, año, mes, dia);

        // Mostrar el DatePickerDialog
        datePickerDialog.show();
    }
}
