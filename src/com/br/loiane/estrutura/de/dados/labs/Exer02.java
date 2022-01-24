package com.br.loiane.estrutura.de.dados.labs;

import com.br.loiane.estrutura.de.dados.aulas.Lista;

import java.util.ArrayList;

public class Exer02 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));

    }
}
