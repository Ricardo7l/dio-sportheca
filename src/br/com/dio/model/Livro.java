package br.com.dio.model;

import java.util.Objects;

public class Livro {
    String nome;
    Integer numeroDePaginas;

    public Livro() {}

    public Livro(String nome, Integer numeroDePaginas) {
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numeroDePaginas, livro.numeroDePaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroDePaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
