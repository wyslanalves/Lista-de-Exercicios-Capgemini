package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício :
       Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
       conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;

    */
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();


        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

    }
}
