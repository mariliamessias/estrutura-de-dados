package com.br.loiane.estrutura.de.dados.teste.lista;

import com.br.loiane.estrutura.de.dados.aulas.Lista;

public class Aula10 {
    public static void main(String[] args) {

        Lista lista = new Lista(3);
        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "1234-1235", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "4444-5678", "contato3@email.com");
        Contato c4 = new Contato("Contato 3", "4444-5678", "contato3@email.com");

        lista.adiciona(c1);
        lista.adiciona(c2);
        lista.adiciona(c3);

        System.out.println(lista);

        int pos = lista.busca(c4);

        if(pos > -1){
            lista.remove(pos);
        }else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(lista);
    }
}
