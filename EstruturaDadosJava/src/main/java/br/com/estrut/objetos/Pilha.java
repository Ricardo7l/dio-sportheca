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

    @Override
    public String toString(){
        if(isEmpty()) {
            return null;
        }
        String mensagem = "";
        No aux = refTopo;
        mensagem += "---------------\n";
        mensagem += "---- Pilha ----\n";
        mensagem += "---------------\n";
        while (true) {
            if(aux != null) {
                mensagem += aux.toString() + "\n";
                aux = aux.getNoAbaixo();
            } else {
                break;
            }
        }
        mensagem += "---------------\n";

        return mensagem;
    }
}
