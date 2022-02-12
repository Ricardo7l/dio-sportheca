package br.com.estrut.objetos;

import java.util.Objects;

public class No<T> {
    private T conteudo;
    private No<T> proximo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return "Nó:{musica='" + conteudo + '}';
    }

    public No<T> getProximoNo() {
        return proximo;
    }

    public void setProximoNo(No<T> proximo) {
        this.proximo = proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        No<?> no = (No<?>) o;
        return conteudo.equals(no.conteudo) && proximo.equals(no.proximo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proximo, conteudo);
    }
}
