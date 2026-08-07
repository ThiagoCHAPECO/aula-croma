package com.example;

public class Main {
    public static void main(String[] args) {
        




        CalculadoraFrete calc = new CalculadoraFrete();

        System.out.println(calc.calcular(20, false));
        System.out.println(calc.calcular(0, false));
        System.out.println(calc.calcular(230, true)); 


    }
}