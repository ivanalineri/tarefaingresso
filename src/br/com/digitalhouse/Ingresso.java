package br.com.digitalhouse;

public class Ingresso {

    private float valor;

    public void imprimeValor(){

    }

    public float getValor() {
        return valor;
    }

    public void setValor(float novoValor) {
        valor = novoValor;
        System.out.println("R$" + valor);

    }

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public Ingresso (){

    }
}
