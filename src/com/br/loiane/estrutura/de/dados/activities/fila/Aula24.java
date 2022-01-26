package com.br.loiane.estrutura.de.dados.activities.fila;

import com.br.loiane.estrutura.de.dados.models.FilaComPrioridade;

public class Aula24 {

    public static void main(String[] args) {
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
        fila.enfileira(new Paciente("A", 2));
        fila.enfileira(new Paciente("C", 1));
        fila.enfileira(new Paciente("B", 3));

        System.out.println(fila);
        System.out.println(fila.desenfilera());
        System.out.println(fila);
    }
}
