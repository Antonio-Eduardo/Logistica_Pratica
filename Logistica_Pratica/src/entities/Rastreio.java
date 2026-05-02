package entities;

import enums.TipoEvento;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rastreio {
    Date dataHora;
    String mensagem;
    TipoEvento tipoEvento;
    Local local;

    public Rastreio() {
    }

    public Rastreio(Date dataHora, String mensagem, TipoEvento tipoEvento, Local local) {
        this.dataHora = dataHora;
        this.mensagem = mensagem;
        this.tipoEvento = tipoEvento;
        this.local = local;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder("\n" + sdf.format(dataHora)).append(" - ");
        sb.append(tipoEvento).append(": ");
        sb.append(mensagem).append(" \n(");
        sb.append(local).append(")\n");

        return sb.toString();
    }
    }

