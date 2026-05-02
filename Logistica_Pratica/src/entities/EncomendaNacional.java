package entities;

import enums.Prioridade;

public class EncomendaNacional extends Encomenda{
    private int cep;

    public EncomendaNacional(){super();}

    public EncomendaNacional(String codigoRastreio, String destinatario, double valorEncomenda, Prioridade prioridade, int cep) {
        super(codigoRastreio, destinatario, valorEncomenda, prioridade);
        this.cep = cep;
    }
    @Override
    public void imposto(){
        valorEncomenda += (valorEncomenda * 0.30);
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EncomendaNacional{");
        sb.append(super.toString());
        sb.append("cep=").append(cep);
        sb.append('}');
        return sb.toString();
    }
}
