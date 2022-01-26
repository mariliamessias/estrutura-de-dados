package com.br.loiane.estrutura.de.dados.models;

//Utilização de generics para receber o tipo da classe
public class Lista<T> extends EstruturaEstatica<T> {

    public Lista() {
        super();
    }

    public Lista(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    /*
    Implementação do método para busca de valores válidos e não nulos
     */
    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    /*
    Utiliza o método busca
     */
    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    /*
    Busca sequencial: verifica elemento por elemento até ele ser encontrado
     */
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    /*
    Retorna a posição última ocorrência do elemento informado
     */
    public int ultimoIndice(T elemento) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    /*
    Remove um elemento a partir do valor dele
     */
    public void remove(T elemento) {
        int pos = this.busca(elemento);
        if (pos > -1) {
            this.remove(pos);
        }
    }

    /*
    Verifica se o elemento está contido na lista
     */
    public boolean contem(T elemento) {
        return this.busca(elemento) > -1;
    }

    /*
    Remover todos os elementos do array
     */
    public void limpar() {
        this.elementos = (T[]) new Object[this.elementos.length];
        this.tamanho = 0;
    }
}
