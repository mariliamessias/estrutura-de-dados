package com.br.loiane.estrutura.de.dados.aulas;

//Utilização de generics para receber o tipo da classe
public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    /*
    Solução final da aula: retornamos um booleano e conseguimos
    criar um array dinâmico, além disso, sabemos a posição final do array
     */
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    /*
    Inserir valor em qualquer posição no vetor
     */
    public boolean adiciona(int posicao, T elemento) {
        //verifica se o valor da posição é valida
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    /*
    Aumentar a capacidade do vetor caso ela já tenha atingido o tamanho máximo
     */
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    /*
    Obter apenas os valores do array que não são nulos
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
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
    public T obtem(int posicao){
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
    Remover elemento a partir da posição
     */
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
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
    public void limpar(){
        this.elementos = (T[]) new Object[this.elementos.length];
        this.tamanho = 0;
    }
}
