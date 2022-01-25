package com.br.loiane.estrutura.de.dados.activities.vetor;

import com.br.loiane.estrutura.de.dados.models.Lista;

public class Aula09 {
    public static void main(String[] args) {
        Lista lista = new Lista(3);

        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona("F");

        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        System.out.println("Remover o elemento E");
        int pos = lista.busca("E");

        if(pos > -1){
            lista.remove(pos);
        }else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(lista);
    }
}
