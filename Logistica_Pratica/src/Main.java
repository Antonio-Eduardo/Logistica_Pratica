import services.ServicoEncomenda;
import services.ServicosCustosAdicionais;
import entities.*;
import enums.Prioridade;
import enums.TipoEvento;
import services.ValidacaoEntrada;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Encomenda> encomendas = new ArrayList<>();

        int opcao=1;
        while (opcao == 1) {
            System.out.print("Deseja cadastrar uma encomenda? [1-SIM|2-NAO]");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    String destinatario = ValidacaoEntrada.lerString(sc,"Insira o destinatario: ");
                    String identificacao = ValidacaoEntrada.lerString(sc,"Insira o numero do documento de identificacao: ");
                    System.out.print("Encomenda nacional ou internacional? [1-Nacional|2-Internacional]");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    switch (tipo){
                        case 1:
                            String codigoRastreioNA = ValidacaoEntrada.lerString(sc,("Digite o codigo de rastreio: "));
                            Prioridade prioridadeNacional = Prioridade.valueOf(ValidacaoEntrada.lerString(sc,"Insira a prioridade [ECONOMICO,SEDEX ou FLASH]: "));
                            double valorEncomendaNacional = ValidacaoEntrada.lerDouble(sc,"Valor da encomenda: ");
                            double frete = ValidacaoEntrada.lerDouble(sc,"Valor do frete: ");
                            int cep = ValidacaoEntrada.lerInteiros(sc,"CEP: ");
                            Encomenda nacional = new EncomendaNacional(destinatario,identificacao,prioridadeNacional,valorEncomendaNacional,codigoRastreioNA,cep);
                            nacional.setTipoEvento(TipoEvento.POSTAGEM);
                            ServicosCustosAdicionais custos = new ServicosCustosAdicionais(frete);
                            custos.calcCustos(nacional);
                            encomendas.add(nacional);
                            break;
                        case 2:
                            String codigoRastreioIn = ValidacaoEntrada.lerString(sc,"Insira o codigo de rastreio: ");
                            Prioridade prioridadeInternacional = Prioridade.valueOf(ValidacaoEntrada.lerString(sc,"Insira a prioridade [ECONOMICO,SEDEX ou FLASH]: "));
                            double valorEncomendaInternacional = ValidacaoEntrada.lerDouble(sc,"Valor da encomenda: ");
                            double freteIn = ValidacaoEntrada.lerDouble(sc,"Valor do frete: ");
                            String paisOrigem = ValidacaoEntrada.lerString(sc,"Pais origem: ");
                            sc.nextLine();
                            Encomenda internacional = new EncomendaInternacional(destinatario,identificacao,prioridadeInternacional,
                            valorEncomendaInternacional,codigoRastreioIn,paisOrigem);
                            ServicosCustosAdicionais custosIn = new ServicosCustosAdicionais(freteIn);
                            custosIn.calcCustos(internacional);
                            encomendas.add(internacional);
                            break;
                    }
                case 2:
                    break;
            }
        }
        for (Encomenda x : encomendas){
            System.out.println(x);
        }
        int opcao1 = ValidacaoEntrada.lerInteiros(sc,"Voce deseja atualizar o status da encomenda? [1-SIM|2-NAO]");
        switch (opcao1){
            case 1:
                ServicoEncomenda servicoEncomenda = new ServicoEncomenda();
                String codigo = ValidacaoEntrada.lerString(sc,"Digite o codigo de rastreio da encomenda a ser atualizada: ");
                Encomenda encomentaEncontrada = servicoEncomenda.busca(encomendas,codigo);
                if (encomentaEncontrada == null){
                    System.out.println("Encomenda nao encontrada!");
                }else {
                    System.out.println("Encomenda: \n" + encomentaEncontrada);
                    TipoEvento attEvento = TipoEvento.valueOf(ValidacaoEntrada.lerString(sc,"Altere o status: [POSTAGEM],[EM_TRANSITO],[SAIU_PARA_ENTREGA],[ENTREGUE],[EXTRAVIADO]"));
                    encomentaEncontrada.atualizarEvento(attEvento);
                    break;
                }
            case 2:
                break;
            default:
                System.out.println("Valor invalido");
        }
        for (Encomenda x : encomendas){
            System.out.println(x);
        }
    }
}
