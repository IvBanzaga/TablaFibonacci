package com.vanzaga.tablafibonacci;

public class Fibonacci {
    public static int[] calculateFibonacci(int MAX) {
        // Verificar si el número es menor que 1
        if (MAX < 1) {
            return new int[0];
        }

        // Inicializamos el array con la serie Fibonacci
        int[] fibonacci = new int[MAX];

        // Asignamos los dos primeros números de la serie
        if (MAX > 0) fibonacci[0] = 0;
        if (MAX > 1) fibonacci[1] = 1;

        // Bucle para generar la serie Fibonacci, i = 2 porque ya tenemos los dos primeros números
        for (int i = 2; i < MAX; i++) {

            // Calculamos el número de Fibonacci en la posición i
            // Sumamos los dos números anteriores
            // fibonacci[i - 1] es el número de Fibonacci en la posición i - 1
            // fibonacci[i - 2] es el número de Fibonacci en la posición i - 2
            // y seguimos hasta llegar a MAX
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}