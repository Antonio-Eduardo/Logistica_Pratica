package entities;

import enums.Prioridade;

public class EncomendaInternacional extends Encomenda {
    double frete;
    double imposto;
    private String paisOrigem;

    public EncomendaInternacional() {
    }

    public EncomendaInternacional(String destinatario, int cpf, Prioridade prioridade, double valorEncomenda, String paisOrigem) {
        super(destinatario, cpf, prioridade, valorEncomenda);
        this.paisOrigem = paisOrigem;
    }

    @Override
    public void imposto() {
        imposto = (valorEncomenda * 0.24);
    }

    @Override
    public void frete() {
        frete = valorEncomenda * 0.1;
    }

    public double getFrete() {
        return frete;
    }

    public double getImposto() {
        return imposto;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EncomendaNacional{");
        sb.append(super.toString());
        sb.append("pais=").append(paisOrigem);
        sb.append("frete=").append(this.frete);
        sb.append('}');
        return sb.toString();
    }
}
