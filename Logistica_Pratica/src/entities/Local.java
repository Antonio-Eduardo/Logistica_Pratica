package entities;

public class Local {
    String pais;
    String cidade;
    String estado;
    String siglaUnidade;

    public Local(){}

    public Local(String cidade, String estado, String siglaUnidade, String pais) {
        this.cidade = cidade;
        this.estado = estado;
        this.siglaUnidade = siglaUnidade;
        this.pais = pais;

    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("pais=").append(pais);
         sb.append("Cidade: ").append(cidade).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append("Sigla: ").append(siglaUnidade);
        return sb.toString();
    }
}
