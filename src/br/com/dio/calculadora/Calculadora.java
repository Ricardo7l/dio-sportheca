package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public int[] receberParametros() {
        int[] parametros = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nDigite o primeiro valor: ");
        parametros[0] = scanner.nextInt();

        System.out.printf("\nDigite o segundo valor: ");
        parametros[1] = scanner.nextInt();

        return parametros;
    }

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        return (double) a / (double) b;
    }
}
