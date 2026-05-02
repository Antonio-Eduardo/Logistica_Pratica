package entities;

import enums.Prioridade;

public class EncomendaInternacional extends Encomenda {
    double frete;

    public EncomendaInternacional(){}

    public EncomendaInternacional(String codigoRastreio, String destinatario, double valorEncomenda, Prioridade prioridade) {
        super(codigoRastreio, destinatario, valorEncomenda, prioridade);
    }

    public void freteCalculo(){
        frete = valorEncomenda * 0.10;
    }
    public void imposto(){
valorEncomenda += (valorEncomenda * 0.24) + frete;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EncomendaNacional{");
        sb.append(super.toString());
        sb.append("frete=").append(frete);
        sb.append('}');
        return sb.toString();
    }
}
