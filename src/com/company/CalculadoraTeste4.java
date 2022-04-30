package com.company;

public class CalculadoraTeste4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // criando o objeto
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println(" Dentro Calculadora teste04");
        System.out.println("Num1 "  +a);
        System.out.println("Num2 "  +b);
    }
}

