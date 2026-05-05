package LogisticaServicos;

import entities.Encomenda;
import entities.EncomendaInternacional;
import entities.EncomendaNacional;

public class ServicosCustosAdicionais {
    double frete;

    public ServicosCustosAdicionais(double frete) {
        this.frete = frete;

    }
    public void calcCustos(Encomenda encomenda) {
       encomenda.setValorFinal(encomenda.calcularTaxa() + encomenda.impostoServico() + encomenda.getValorBase());
    }
    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}
