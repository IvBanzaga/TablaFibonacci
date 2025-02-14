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

        txt_tabla = findViewById(R.id.textView);
        txt_num = findViewById(R.id.txt_num);
    }

    public void calcular(View view) {
        // Rescatamos el número introducido por el usuario
        String input = txt_num.getText().toString();
        if (input.isEmpty()) {
            txt_tabla.setText("Por favor, introduce un número.");
            return;
        }

        // Convertimos el texto a un número entero
        int MAX = Integer.parseInt(input);
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
        for (int i = 0; i < fibonacciSequence.length; i++) {
            result.append(fibonacciSequence[i]);
            if (i < fibonacciSequence.length - 1) {
                result.append("-");
            }
        }
        txt_tabla.setText(result.toString());
    }
}