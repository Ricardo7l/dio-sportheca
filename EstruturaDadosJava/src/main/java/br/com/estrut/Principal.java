package br.com.estrut;

import br.com.estrut.objetos.MeuObjeto;
import br.com.estrut.objetos.No;
import br.com.estrut.objetos.Pilha;

public class Principal {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        System.out.println("A=" + a + " B=" + b + "\n");
        b = 2;
        System.out.println("A=" + a + " B=" + b + "\n");

        MeuObjeto musica1 = new MeuObjeto("Primeira música");
        MeuObjeto musica2 = new MeuObjeto("Segunda música");
        MeuObjeto musica3 = new MeuObjeto("Terceira música");
        MeuObjeto musica4 = new MeuObjeto("Quarta música");
        MeuObjeto musica5 = new MeuObjeto("Quinta música");

        musica1.setProximo(musica2);
        musica2.setProximo(musica3);
        musica3.setProximo(musica4);
        musica4.setProximo(musica5);

        System.out.println(musica1);

        System.out.println(musica1);
        System.out.println(musica1.getProximo());
        System.out.println(musica1.getProximo().getProximo());
        System.out.println(musica1.getProximo().getProximo().getProximo());
        System.out.println(musica1.getProximo().getProximo().getProximo().getProximo());

        MeuObjeto aux = musica1;
        while (aux.getProximo() != null) {
            System.out.println(aux.getMusica());
            aux = aux.getProximo();
        }

        No<String> no1 = new No<>("Primeira");
        No<String> no2 = new No<>("Segunda");
        No<String> no3 = new No<>("Terceira");
        No<String> no4 = new No<>("Quarta");
        No<String> no5 = new No<>("Quinta");

        no1.setNoAbaixo(no2);
        no2.setNoAbaixo(no3);
        no3.setNoAbaixo(no4);
        no4.setNoAbaixo(no5);

        System.out.println(no1);
        System.out.println(no1.getNoAbaixo());
        System.out.println(no1.getNoAbaixo().getNoAbaixo());
        System.out.println(no1.getNoAbaixo().getNoAbaixo().getNoAbaixo());
        System.out.println(no1.getNoAbaixo().getNoAbaixo().getNoAbaixo().getNoAbaixo());

        Pilha pilha = new Pilha();

        System.out.println(pilha.refTopo);

        pilha.push(no1);
        pilha.push(no2);
        pilha.push(no3);
        pilha.push(no4);

        System.out.println(pilha.refTopo);
        System.out.println(pilha.isEmpty());
        pilha.pop();
        System.out.println("retirado: "  + pilha.pop());
        System.out.println(pilha.refTopo);
        System.out.println(pilha.isEmpty());
        System.out.println("retirado: "  + pilha.pop());
        System.out.println("retirado: "  + pilha.pop());
        System.out.println("retirado: "  + pilha.pop());
        System.out.println("retirado: "  + pilha.pop());
        System.out.println(pilha.refTopo);
        System.out.println(pilha.isEmpty());
    }
}
