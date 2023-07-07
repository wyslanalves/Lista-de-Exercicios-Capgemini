package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício :
       Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
       total percorrida pelo automóvel e o total de combustível gasto;

    */
        double consumoMedia;
        double distanciaPercorrida;
        double totalCombustivel;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Distância");
        distanciaPercorrida = sc.nextDouble();

        System.out.println("Digite o Total de Combustível");
        totalCombustivel = sc.nextDouble();

        consumoMedia = distanciaPercorrida  / totalCombustivel;
        System.out.println("O consumo Medio do automóvel é de: " + consumoMedia + "km/1.");



    }
}
