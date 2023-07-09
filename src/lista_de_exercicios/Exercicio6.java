package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício :
       Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
       possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
       trocados;

    */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        int variavelA = sc.nextInt();

        System.out.println("Digite sua Nota1");
        int variavelB = sc.nextInt();

        int variavelAuxiliar;

        System.out.println("Valor da Variavel A que foi Passado " + variavelA);
        System.out.println("Valor da Variavel B que foi Passado " + variavelB);

        variavelAuxiliar = variavelA;
        variavelA = variavelB;
        variavelB = variavelAuxiliar;

        System.out.println("-------------------------VALORES DEPOIS DA TROCA-------------------------");

        System.out.println("Valor da Variavel A: " + variavelA);
        System.out.println("Valor da Variavel B: " + variavelB);







    }
}
