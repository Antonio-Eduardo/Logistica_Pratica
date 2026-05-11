package services;

import exceptions.EncomendaNaoEncontrada;
import entities.Encomenda;

import java.util.List;

public class ServicoEncomenda {
    public Encomenda busca(List<Encomenda> encomenda, String codigoRastreio) {
         Encomenda encomendaBusca = encomenda.stream().filter(c -> c.getCodigoRastreio().equals(codigoRastreio)).findFirst().orElse(null);
        if (encomendaBusca ==  null){
            throw new EncomendaNaoEncontrada();
        }
        return encomendaBusca;
    }
}
