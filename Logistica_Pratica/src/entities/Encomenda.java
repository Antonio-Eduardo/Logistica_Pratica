package entities;

import enums.Prioridade;
import enums.TipoEvento;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Encomenda {
    private String codigoRastreio;
    private String destinatario;
    private Prioridade prioridade;
    protected double valorEncomenda;
    private List<Rastreio> rastreio = new ArrayList<>();

    public Encomenda(){}

    public Encomenda(String codigoRastreio, String destinatario, double valorEncomenda, Prioridade prioridade) {
        this.codigoRastreio = codigoRastreio;
        this.destinatario = destinatario;
        this.valorEncomenda = valorEncomenda;
        this.prioridade = prioridade;
    }

    public abstract void imposto();

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public List<Rastreio> getRastreio() {
        return rastreio;
    }

    public void setRastreio(List<Rastreio> rastreio) {
        this.rastreio = rastreio;
    }

    public double getValorEncomenda() {
        return valorEncomenda;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("====DETALHES DA ENCOMENDA=====\n");
        sb.append("Codigo de Rastreio: ").append(codigoRastreio).append("\n");
        sb.append("Destinatario: ").append(destinatario);
        sb.append("Valor encomenda:").append(valorEncomenda);
        sb.append("\n---------------------------------------");
        return sb.toString();
    }
}
