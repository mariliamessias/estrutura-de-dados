package com.br.loiane.estrutura.de.dados.teste.lista;

import com.br.loiane.estrutura.de.dados.aulas.Lista;

public class Aula07 {
    public static void main(String[] args) {
        Lista lista = new Lista(10);

        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("E");
        lista.adiciona("F");
        lista.adiciona("G");

        System.out.println(lista);
        lista.adiciona(0, "A");
        System.out.println(lista);
        lista.adiciona(3, "D");
        System.out.println(lista);
    }
}
