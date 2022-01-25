package com.br.loiane.estrutura.de.dados.exercises.pilha;

import com.br.loiane.estrutura.de.dados.models.Pilha;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {

            try {
                System.out.println("Entre com um número: ");
                int num = scan.nextInt();

                if (num % 2 == 0) {
                    System.out.println("Número par, Empilhando o número: " + num);
                    pilha.empilha(num);
                } else {
                    Integer desempilhado = pilha.desempilha();
                    if (desempilhado == null) {
                        System.out.println("Pilha está vazia");
                    } else {
                        System.out.println("Número ímpar, Desempilhando o número: " + desempilhado);
                    }
                }
            } catch (Exception e) {
                System.out.println("Número Inválido");
                break;
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");
        while (!pilha.estaVazia()) {
            System.out.println("Número ímpar, Desempilhando o número: " + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }
}
