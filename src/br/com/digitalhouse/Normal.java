package br.com.digitalhouse;

public class Normal extends Ingresso {

    public void ingressoNormal(){

    }

    @Override
    public void imprimeValor() {
        ingressoNormal();

    }

    public Normal(float valor) {
        super(valor);
    }
}
