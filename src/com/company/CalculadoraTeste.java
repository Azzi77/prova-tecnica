package com.company;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();   // inicializando o objetos
        calculadora.somaDoisNumeros();   // chamando o metodo da classe calculadora

        System.out.println( "Finalizando Caculadora teste");
        calculadora.subtraiDoisNumeros();
    }
}
