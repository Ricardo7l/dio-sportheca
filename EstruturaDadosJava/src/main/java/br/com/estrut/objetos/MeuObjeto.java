package br.com.estrut.objetos;

import java.util.Objects;

public class MeuObjeto {
    private String musica;
    private MeuObjeto proximo;

    public MeuObjeto(String musica) {
        this.musica = musica;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return "MeuObjeto{musica='" + musica + '}';
    }

    public MeuObjeto getProximo() {
        return proximo;
    }

    public void setProximo(MeuObjeto proximo) {
        this.proximo = proximo;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeuObjeto meuObjeto = (MeuObjeto) o;
        return proximo.equals(meuObjeto.proximo) && musica.equals(meuObjeto.musica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proximo, musica);
    }
}
