package com.br.loiane.estrutura.de.dados.teste.lista;

import com.br.loiane.estrutura.de.dados.aulas.Lista;

public class Aula05 {
    public static void main(String[] args) {
        Lista lista = new Lista(10);

        lista.adiciona("elemento 1");
        lista.adiciona("elemento 2");

        System.out.println(lista.tamanho());
        System.out.println(lista);
        System.out.println(lista.busca(0));
    }
}
