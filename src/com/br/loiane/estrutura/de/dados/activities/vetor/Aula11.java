package com.br.loiane.estrutura.de.dados.activities.vetor;

import com.br.loiane.estrutura.de.dados.models.Lista;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(2);
        lista.adiciona("A");
        lista.adiciona("X");

        System.out.println(lista);
    }
}
