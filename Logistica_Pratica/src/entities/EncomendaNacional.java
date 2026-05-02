package entities;

import enums.Prioridade;

public class EncomendaNacional extends Encomenda{
    private int cep;

    public EncomendaNacional(){super();}

    public EncomendaNacional(String destinatario, int cpf, Prioridade prioridade, double valorEncomenda, int cep) {
        super(destinatario, cpf, prioridade, valorEncomenda);
        this.cep = cep;
    }

    @Override
    public void imposto(){
        valorEncomenda += (valorEncomenda * 0.36);
    }
    @Override
    public void frete(){
        valorEncomenda += (valorEncomenda * 0.05);
    }

    public int getCep() {
        return cep;
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
