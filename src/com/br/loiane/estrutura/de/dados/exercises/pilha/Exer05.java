package com.br.loiane.estrutura.de.dados.exercises.pilha;

import com.br.loiane.estrutura.de.dados.models.Pilha;

public class Exer05 {
    public static void main(String[] args) {

        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");
    }

    public static void imprimeResultado(String palavra){
        System.out.println( palavra + " é palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<Character>();
        for (int i = 0; i<palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        String paralavraInversa = "";
        while (!pilha.estaVazia()){
            paralavraInversa += pilha.desempilha();
        }

        return palavra.equalsIgnoreCase(paralavraInversa);

    }
}
