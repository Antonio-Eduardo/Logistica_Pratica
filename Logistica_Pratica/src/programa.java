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
            System.out.print("Deseja cadastrar uma encomenda? (1-SIM|2-NAO)");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Encomenda nacional ou internacional? (1-Nacional|2-Internacional");
                    int tipo = sc.nextInt();
                    switch (tipo){
                        case 1:
                            System.out.print("Insira o destinatario: ");
                            String destinatarioNacional = sc.nextLine();
                            System.out.print("Insira o CPF: ");
                            int cpf = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Insira a prioridade(ECONOMICO,SEDEX ou FLASH: ");
                            Prioridade prioridadeNacional = Prioridade.valueOf(sc.nextLine());
                            System.out.print("Valor da encomenda: ");
                            double valorEncomendaNacional = sc.nextDouble();
                            System.out.print("CEP: ");
                            int cep = sc.nextInt();
                            sc.nextLine();
                            Encomenda nacional = new EncomendaNacional(destinatarioNacional,cpf,prioridadeNacional,valorEncomendaNacional,cep);
                            encomendas.add(nacional);
                            break;
                        case 2:
                            System.out.print("Insira o destinatario: ");
                            String destinatarioInternacional = sc.nextLine();
                            System.out.print("Insira o numero do documento de identificacao: ");
                            int identificacaoInternacional = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Insira a prioridade(ECONOMICO,SEDEX ou FLASH: ");
                            Prioridade prioridadeInternacional = Prioridade.valueOf(sc.nextLine());
                            System.out.print("Valor da encomenda: ");
                            double valorEncomendaInternacional = sc.nextDouble();
                            System.out.print("Pais origem: ");
                            String paisOrigem = sc.nextLine();
                            sc.nextLine();
                            Encomenda internacional = new EncomendaInternacional(destinatarioInternacional,identificacaoInternacional,prioridadeInternacional,valorEncomendaInternacional,paisOrigem);
                            encomendas.add(internacional);
                            break;
                    }
                case 2:
                    break;
            }
        }
    }
}
