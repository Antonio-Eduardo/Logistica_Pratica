package LogisticaServicos;

import entities.Encomenda;

import java.util.List;

public class ServicoEncomenda {
    public Encomenda busca(List<Encomenda> encomenda, String codigoRastreio){
return encomenda.stream().filter(c -> c.getCodigoRastreio().equals(codigoRastreio)).findFirst().orElse(null);
    }
}
