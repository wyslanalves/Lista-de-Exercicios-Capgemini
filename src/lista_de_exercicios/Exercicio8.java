package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício :
       Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
       dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
       disponíveis com ousuário;

    */

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorReais = quantidadeDolares * cotacao;

        System.out.println("O valor em reais é: R$" + valorReais);

    }
}
