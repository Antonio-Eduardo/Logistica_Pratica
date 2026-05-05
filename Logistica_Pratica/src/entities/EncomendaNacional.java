package entities;

import enums.Prioridade;

public class EncomendaNacional extends Encomenda{
    private int cep;

    public EncomendaNacional(){super();}

    public EncomendaNacional(String destinatario, long cpf, Prioridade prioridade, double valorEncomenda, int cep) {
        super(destinatario, cpf, prioridade, valorEncomenda);
        this.cep = cep;
    }
    public int getCep() {
        return cep;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("====[Encomenda Nacional]====");
        sb.append(super.toString());
        sb.append("\nCEP= ").append(cep);

        return sb.toString();
    }
}
