package entities;

import enums.Prioridade;

public class EncomendaInternacional extends Encomenda {
    private String paisOrigem;

    public EncomendaInternacional() {
    }

    public EncomendaInternacional(String destinatario, String cpf, Prioridade prioridade, double valorBase,String codigoRastreio, String paisOrigem) {
        super(destinatario, cpf, prioridade, valorBase,codigoRastreio);
        this.paisOrigem = paisOrigem;
    }
    @Override
    public double calcularTaxa(){return valorBase * 0.15;}
    public String getPaisOrigem() {
        return paisOrigem;
    }

    @Override
    public double impostoServico(){
        return valorBase * 0.25;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("====[Encomenda Internacional]====");
        sb.append(super.toString());
        sb.append("pais=").append(paisOrigem);
        return sb.toString();
    }
}
