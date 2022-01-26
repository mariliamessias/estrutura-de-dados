package com.br.loiane.estrutura.de.dados.activities.fila;

import com.br.loiane.estrutura.de.dados.models.Fila;

public class Aula22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);
        System.out.println(fila.desenfilera());
        System.out.println(fila);
        System.out.println(fila.desenfilera());
        System.out.println(fila);
        System.out.println(fila.desenfilera());
        System.out.println(fila);
    }
}
