package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício :
       Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
       No finalinformar o nome do aluno e a sua média (aritmética);

    */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua Nota1");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua Nota2");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua Nota3");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Olá " + nome + " sua Media Foi ? " + media);


    }
}
