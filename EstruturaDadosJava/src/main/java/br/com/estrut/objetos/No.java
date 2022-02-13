package br.com.estrut.objetos;

import java.util.Objects;

public class No<T> {
    private T conteudo;
    private No<T> noAbaixo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.noAbaixo = null;
    }

    @Override
    public String toString() {
        return "Nó:{musica='" + conteudo + '}';
    }

    public No<T> getNoAbaixo() {
        return noAbaixo;
    }

    public void setNoAbaixo(No<T> proximo) {
        this.noAbaixo = proximo;
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
        return conteudo.equals(no.conteudo) && noAbaixo.equals(no.noAbaixo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noAbaixo, conteudo);
    }
}
