package com.br.loiane.estrutura.de.dados.exercises.pilha;

import com.br.loiane.estrutura.de.dados.models.Pilha;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um número: ");
            int num = scan.nextInt();

            if (num == 0) {
                desempilha(par, "par");
                desempilha(impar, "ímpar");
            } else if (num % 2 == 0) {
                System.out.println("Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
                impar.empilha(num);
            }
        }
        desempilhaTodos(par, "par");
        desempilhaTodos(impar, "ímpar");

    }

    private static void desempilhaTodos(Pilha<Integer> pilha, String nome) {

        System.out.println("Desempilhando todos os números da pilha " + nome);
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando da pilha " + nome + ": " + pilha.desempilha());
        }
    }

    private static void desempilha(Pilha<Integer> pilha, String nome) {
        Integer desempilhado = pilha.desempilha();
        if (desempilhado == null) {
            System.out.println("Pilha " + nome + " vazia");
        } else {
            System.out.println("Desempilhando da pilha " + nome + ": " + desempilhado);
        }
    }
}
