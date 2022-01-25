package com.br.loiane.estrutura.de.dados.activities.pilha;

import com.br.loiane.estrutura.de.dados.models.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);
        System.out.println("Desempilhando elemento "+ pilha.desempilha());
        System.out.println(pilha);
    }
}
