package entities;

public class Local {
    String cidade;
    String estado;
    String siglaUnidade;

    public Local(){}

    public Local(String cidade, String estado, String siglaUnidade) {
        this.cidade = cidade;
        this.estado = estado;
        this.siglaUnidade = siglaUnidade;

    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cidade: ").append(cidade).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append("Sigla: ").append(siglaUnidade);
        return sb.toString();
    }
}
