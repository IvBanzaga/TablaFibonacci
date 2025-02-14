package com.vanzaga.tablafibonacci;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txt_tabla;
    private EditText txt_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Inicializamos las vistas
        txt_tabla = findViewById(R.id.textView);
        txt_num = findViewById(R.id.txt_num);
    }

    public void calcular(View view) {
        // Rescatamos el número introducido por el usuario
        int MAX = Integer.parseInt(txt_num.getText().toString());

        if (MAX < 1) {
            txt_tabla.setText("Por favor, introduce un número mayor que 0.");
            return;
        }


        // Utilizamos la clase Fibonacci para calcular la secuencia
        int[] fibonacciSequence = Fibonacci.calculateFibonacci(MAX);

        // Mostramos la secuencia en el TextView
        // StringBuilder se puede guardar en un archivo
        // se puede guardar en un archivo, de la siguiente forma:


        StringBuilder result = new StringBuilder();
        for (int num : fibonacciSequence) {
            result.append(num).append(" ");
        }

        txt_tabla.setText(result.toString());
    }
}