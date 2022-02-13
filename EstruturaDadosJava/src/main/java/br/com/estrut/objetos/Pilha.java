package br.com.estrut.objetos;

public class Pilha {
    public No<No> refTopo;

    public Pilha() {
        this.refTopo = null;
    }

    public boolean isEmpty() {
        return this.refTopo == null ? true : false;
    }

    public No top() {
        return refTopo;
    }

    public void push(No novoNo) {
        No auxiliar = refTopo;
        refTopo = novoNo;
        novoNo.setNoAbaixo(auxiliar);
    }

    public No pop() {
        if(isEmpty()) {
            return null;
        }
        No retirado = refTopo;
        refTopo = refTopo.getNoAbaixo();
        return retirado;
    }
}
