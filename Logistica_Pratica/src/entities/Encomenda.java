package entities;
import enums.Prioridade;
import enums.TipoEvento;
import java.util.ArrayList;
import java.util.List;

public abstract class Encomenda {
    private String codigoRastreio;
    private String destinatario;
    private Prioridade prioridade;
    private TipoEvento tipoEvento;
    protected double valorBase;
    private double valorFinal;
    private String cpf;
    private List<TipoEvento> historico = new ArrayList<>();

    public Encomenda(){}

    public Encomenda(String destinatario, String cpf, Prioridade prioridade, double valorBase, String codigoRastreio) {
        this.destinatario = destinatario;
        this.cpf = cpf;
        this.prioridade = prioridade;
        this.valorBase = valorBase;
        this.codigoRastreio = codigoRastreio;
    }

    public abstract double calcularTaxa();
    public abstract double impostoServico();
    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    public void atualizarEvento(TipoEvento tipoEvento){
        historico.add(tipoEvento);
        this.tipoEvento = tipoEvento;
    }

    public List<TipoEvento> getHistorico() {
        return historico;
    }

    public void setHistorico(List<TipoEvento> historico) {
        this.historico = historico;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public double getValorBase() {
        return valorBase;
    }

    public String getCpf() {
        return cpf;
    }

    public void setValorbASE(double valorEncomenda) {
        this.valorBase = valorEncomenda;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("\nDestinatario= ").append(destinatario);
        sb.append("\nValor Final= ").append(String.format("%.2f R$", valorFinal));
        sb.append("\nCPF= ").append(cpf);
        sb.append("\nPrioridade= ").append(prioridade);
        sb.append("\nSituacao= ").append(tipoEvento);
        return sb.toString();
    }
}
