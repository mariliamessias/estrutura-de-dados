package com.br.loiane.estrutura.de.dados.activities.fila;

import com.br.loiane.estrutura.de.dados.models.Fila;

public class Aula20 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
        System.out.println(fila);

    }
}
