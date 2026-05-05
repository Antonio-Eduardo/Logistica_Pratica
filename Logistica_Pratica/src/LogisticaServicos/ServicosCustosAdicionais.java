package LogisticaServicos;

import entities.Encomenda;
import entities.EncomendaInternacional;
import entities.EncomendaNacional;

public class ServicosCustosAdicionais {
    double frete;
    ImpostoServico imposto;
    TaxaServico taxa;

    public ServicosCustosAdicionais(double frete) {
        this.frete = frete;
        this.imposto = new ImpostoServico();
        this.taxa = new TaxaServico();
    }

    public void calcCustos(Encomenda encomenda) {
        if (encomenda instanceof EncomendaNacional) {
            double valorBase = encomenda.getValorEncomenda();
            double valorFinal = valorBase + (valorBase * tipoImposto(encomenda)) + (valorBase * tipoEncomenda(encomenda)) + frete;
            encomenda.setValorEncomenda(valorFinal);
        }
        if (encomenda instanceof EncomendaInternacional) {
            double valorBase = encomenda.getValorEncomenda();
            double valorFinal = valorBase + ( valorBase * tipoImposto(encomenda)) + (valorBase * tipoEncomenda(encomenda)) + frete;
            encomenda.setValorEncomenda(valorFinal);
        }
    }

    public double tipoEncomenda(Encomenda encomenda) {
        if (encomenda instanceof EncomendaNacional) {
            return taxa.taxaNacional();
        }
        if (encomenda instanceof EncomendaInternacional) {
            return taxa.taxaInternacional();
        }
        return 0.0;
    }

    public double tipoImposto(Encomenda encomenda) {
        if (encomenda instanceof EncomendaNacional) {
            return imposto.impostoNacional();
        }
        if (encomenda instanceof EncomendaInternacional) {
            return imposto.impostoInternacional();
        }
        return 0.0;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
}
