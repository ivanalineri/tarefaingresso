package br.com.digitalhouse;

public class Vip extends Ingresso {

    private float valorAdicional;

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float novoValorAdicional) {
        valorAdicional = getValor() + novoValorAdicional;

    }

    @Override
    public void imprimeValor() {


    }

    public Vip(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Vip(){

    }
}
