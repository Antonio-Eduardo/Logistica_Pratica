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
    private int cpf;

    public Encomenda(){}

    public Encomenda(String destinatario, int cpf, Prioridade prioridade, double valorEncomenda) {
        this.destinatario = destinatario;
        this.cpf = cpf;
        this.prioridade = prioridade;
        this.valorEncomenda = valorEncomenda;
    }

    public abstract void imposto();
    public abstract  void frete();
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

    public int getCpf() {
        return cpf;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("====DETALHES DA ENCOMENDA=====\n");
        sb.append("Codigo de Rastreio: ").append(codigoRastreio).append("\n");
        sb.append("Destinatario: ").append(destinatario);
        sb.append("Valor encomenda:").append(valorEncomenda);
        sb.append("cpf=").append(cpf);
        return sb.toString();
    }
}
