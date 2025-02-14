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

        StringBuilder resultado = new StringBuilder();
        int num1 = 0;
        int num2 = 1;

        // Imprime los dos primeros números y los añadimos al resultado
        resultado.append(num1).append("-").append(num2).append("-");

        // Bucle para generar la serie Fibonacci , i = 2 por que ya tenemos los dos primeros números
        for (int i = 2; i < MAX; i++) {

            // Calculamos el siguiente número
            int fibonacci = num1 + num2;

            // Y lo añadimos al resultado
            resultado.append(fibonacci).append("-");

            // Acualizamos los números
            num1 = num2;
            num2 = fibonacci;
        }

        // Mostramos el resultado en el TextView, lo mostramos con un guion en medio
        txt_tabla.setText(resultado.toString());


    }
}