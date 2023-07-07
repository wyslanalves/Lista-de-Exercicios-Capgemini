package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    /*
                                            Lista De Exercícios
       Objetivo do Exercício :
       Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
       por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
       efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

    */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Vendedor: ");
        String nomeVendedor = sc.nextLine();

        System.out.println("Digite o salario Fixo do Vendedor: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor: ");
        double totalDeVendas = sc.nextDouble();

        double comissao = totalDeVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome do Vendedor: " + nomeVendedor);
        System.out.println("Salário Fixo: R$" + salarioFixo);
        System.out.println("Salário Final: R$" + salarioFinal);




    }
}
