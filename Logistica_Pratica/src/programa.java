import LogisticaServicos.ServicoEncomenda;
import LogisticaServicos.ServicosCustosAdicionais;
import entities.*;
import enums.Prioridade;
import enums.TipoEvento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class programa {
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
                    System.out.print("Encomenda nacional ou internacional? [1-Nacional|2-Internacional]");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    switch (tipo){
                        case 1:
                            System.out.print("Insira o destinatario: ");
                            String destinatarioNacional = sc.nextLine();
                            System.out.print("Insira o CPF: ");
                            String cpf = sc.nextLine();
                            System.out.print("Digite um codigo de rastreio: ");
                            String codigoRastreioNA = sc.nextLine();
                            System.out.print("Insira a prioridade [ECONOMICO,SEDEX ou FLASH]: ");
                            Prioridade prioridadeNacional = Prioridade.valueOf(sc.nextLine());
                            System.out.print("Valor da encomenda: ");
                            double valorEncomendaNacional = sc.nextDouble();
                            System.out.print("Valor do frete: ");
                            double frete = sc.nextDouble();
                            System.out.print("CEP: ");
                            int cep = sc.nextInt();
                            sc.nextLine();
                            Encomenda nacional = new EncomendaNacional(destinatarioNacional,cpf,prioridadeNacional,valorEncomendaNacional,codigoRastreioNA,cep);
                            nacional.setTipoEvento(TipoEvento.POSTAGEM);
                            ServicosCustosAdicionais custos = new ServicosCustosAdicionais(frete);
                            custos.calcCustos(nacional);
                            encomendas.add(nacional);
                            break;
                        case 2:
                            System.out.print("Insira o destinatario: ");
                            String destinatarioInternacional = sc.nextLine();
                            System.out.print("Insira o numero do documento de identificacao: ");
                            String identificacaoInternacional = sc.nextLine();
                            sc.nextLine();
                            System.out.print("Insira o codigo de rastreio: ");
                            String codigoRastreioIn = sc.nextLine();
                            System.out.print("Insira a prioridade [ECONOMICO,SEDEX ou FLASH]: ");
                            Prioridade prioridadeInternacional = Prioridade.valueOf(sc.nextLine());
                            System.out.print("Valor da encomenda: ");
                            double valorEncomendaInternacional = sc.nextDouble();
                            System.out.print("Valor do frete: ");
                            double freteIn = sc.nextDouble();
                            System.out.print("Pais origem: ");
                            String paisOrigem = sc.nextLine();
                            sc.nextLine();
                            Encomenda internacional = new EncomendaInternacional(destinatarioInternacional,identificacaoInternacional,prioridadeInternacional,
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
        System.out.print("Voce deseja atualizar o status da encomenda? [1-SIM|2-NAO]");
        int opcao1 = sc.nextInt(); sc.nextLine();
        switch (opcao1){
            case 1:
                ServicoEncomenda servicoEncomenda = new ServicoEncomenda();
                System.out.print("Digite o codigo de rastreio da encomenda a ser atualizada: ");
                String codigo = sc.nextLine();
                Encomenda encomentaEncontrada = servicoEncomenda.busca(encomendas,codigo);
                System.out.println("Encomenda: \n" + encomentaEncontrada);
                System.out.println("Altere o status: [POSTAGEM],[EM_TRANSITO],[SAIU_PARA_ENTREGA],[ENTREGUE],[EXTRAVIADO]");
                TipoEvento attEvento = TipoEvento.valueOf(sc.nextLine());
                encomentaEncontrada.setTipoEvento(attEvento);
                break;
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
