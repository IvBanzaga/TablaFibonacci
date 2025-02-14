package com.vanzaga.tablafibonacci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txt_tabla;
    private EditText txt_num;

    private Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializamos las vistas
        txt_tabla = findViewById(R.id.textView);
        txt_num = findViewById(R.id.txt_num);
        btn_calcular = findViewById(R.id.btn_calcular);

        // Configurar botón de cálculo
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el número ingresado por el usuario
                int number = Integer.parseInt(txt_num.getText().toString());

                // Calcular la secuencia de Fibonacci utilizando la clase Fibonacci
                int[] fibonacciSequence = Fibonacci.calculateFibonacci(number);

                // Mostrar la secuencia en el TextView
                StringBuilder result = new StringBuilder();
                for (int num : fibonacciSequence) {
                    result.append(num).append("\n");
                }
                txt_tabla.setText(result.toString());
            }
        });
    }
}



    /*public void calcular(View view) {
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
    }*/
