package entities;

import enums.Prioridade;

public class EncomendaInternacional extends Encomenda {
    private String paisOrigem;

    public EncomendaInternacional() {
    }

    public EncomendaInternacional(String destinatario, long cpf, Prioridade prioridade, double valorEncomenda, String paisOrigem) {
        super(destinatario, cpf, prioridade, valorEncomenda);
        this.paisOrigem = paisOrigem;
    }
    public String getPaisOrigem() {
        return paisOrigem;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("====[Encomenda Internacional]====");
        sb.append(super.toString());
        sb.append("pais=").append(paisOrigem);
        return sb.toString();
    }
}
