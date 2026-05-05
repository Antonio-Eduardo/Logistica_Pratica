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
    private long cpf;

    public Encomenda(){}

    public Encomenda(String destinatario, long cpf, Prioridade prioridade, double valorEncomenda) {
        this.destinatario = destinatario;
        this.cpf = cpf;
        this.prioridade = prioridade;
        this.valorEncomenda = valorEncomenda;
    }
    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public double getValorEncomenda() {
        return valorEncomenda;
    }

    public long getCpf() {
        return cpf;
    }

    public void setValorEncomenda(double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("\nDestinatario= ").append(destinatario);
        sb.append("\nValor encomenda= ").append(String.format("%.2f R$", valorEncomenda));
        sb.append("\nCPF= ").append(cpf);
        sb.append("\nPrioridade= ").append(prioridade);
        return sb.toString();
    }
}
