package com.company;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro (); // objetos
        Carro carro2 = new Carro (); // objetos


        carro1.nome = "Fusca bala";
        carro1.modelo = "sport";
        carro1.ano = 1977;

        carro2.nome = "Mustang";
        carro2.modelo = "GT";
        carro2.ano = 1968;


        System.out.println( carro1.nome);
        System.out.println( carro1.modelo);
        System.out.println( carro1.ano);


        System.out.println( carro2.nome);
        System.out.println( carro2.modelo);
        System.out.println( carro2.ano);

    }
}
