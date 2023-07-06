package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício : Faça um algoritmo que receba dois números e exiba o resultado da sua soma

    */
        int numero1;
        int numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Primeiro Número:");
        numero1 = sc.nextInt();

        System.out.println("Digite seu Segundo Número:");
        numero2 = sc.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("Resultado : " + resultado);





    }
}
