package entities;

import enums.Prioridade;

public class EncomendaNacional extends Encomenda{
    private int cep;

    public EncomendaNacional(){super();}

    public EncomendaNacional(String destinatario, String cpf, Prioridade prioridade, double valorBase,String codigoRastreio, int cep) {
        super(destinatario, cpf, prioridade, valorBase,codigoRastreio);
        this.cep = cep;
    }
    @Override
    public double calcularTaxa(){
        return valorBase *0.08;
    }
    @Override
    public double impostoServico(){
        return valorBase * 0.36;
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
