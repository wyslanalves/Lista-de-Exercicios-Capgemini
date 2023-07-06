package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício :
       Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
       dos dois números lidos;

    */
        int numero1;
        int numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Primeiro Número:");
        numero1 = sc.nextInt();

        System.out.println("Digite seu Segundo Número:");
        numero2 = sc.nextInt();

        int adicao = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        System.out.println("Adição : " + adicao);
        System.out.println("Subtração : " + subtracao);
        System.out.println("Multiplicação : " + multiplicacao);
        System.out.println("Divisão : " + divisao);

    }
}
