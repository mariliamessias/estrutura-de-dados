package com.br.loiane.estrutura.de.dados.exercises.vetor;

import com.br.loiane.estrutura.de.dados.models.Lista;

public class Exer05 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);

    }
}
