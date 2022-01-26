package com.br.loiane.estrutura.de.dados.models;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileira(T elemento){
        this.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()) return null;
        return this.elementos[0];
    }

    public T desenfilera(){
        final int POS = 0;
        if(estaVazia()) return null;
        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }

}
