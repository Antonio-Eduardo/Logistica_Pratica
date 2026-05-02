package entities;

import enums.TipoEvento;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Rastreio {
    LocalDateTime dataHora;
    String mensagem;
    TipoEvento tipoEvento;
    Local local;

    public Rastreio() {
    }

    public Rastreio(LocalDateTime dataHora, String mensagem, TipoEvento tipoEvento, Local local) {
        this.dataHora = dataHora;
        this.mensagem = mensagem;
        this.tipoEvento = tipoEvento;
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Local getLocal() {
        return local;
    }

    public String getMensagem() {
        return mensagem;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
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

