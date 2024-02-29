/*
 Criar um programa para ler um número inteiro, e depois dizer se este número 
é par ou ímpar     if(N % 2 == 0) {}
 */
package com.mycompany.parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        int numero = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número!");

        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É um número par");
        } else {
            System.out.println("É um número ímpar");
        }
    }
}
