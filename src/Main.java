import Entities.Cliente;
import Entities.Veiculo;
import Services.OrdemDeServico;
import Services.StatusService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrdemDeServico service = new OrdemDeServico();

        int opcao = 0;

        do {
            System.out.println("\n=== Sistema Oficina ===");
            System.out.println("1 - Adicionar Ordem de Serviço");
            System.out.println("2 - Listar Ordens de Serviço");
            System.out.println("3 - Atualizar Status da Ordem");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID da ordem: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir o \n

                    Cliente cliente = new Cliente();
                    Veiculo veiculo = new Veiculo();

                    System.out.println("Escolha o status: ABERTA, EM_ANDAMENTO, CONCLUIDA");
                    String statusStr = scanner.nextLine().toUpperCase();
                    StatusService status = StatusService.valueOf(statusStr);

                    OrdemDeServico novaOrdem = new OrdemDeServico(id,cliente,veiculo,status);
                    System.out.println("Ordem adicionada com sucesso!");
                    break;

                case 2:
                    List<OrdemDeServico> ordens = service.ExibirServico();
                    if (ordens.isEmpty()) {
                        System.out.println("Nenhuma ordem cadastrada.");
                    } else {
                        System.out.println("=== Ordens de Serviço ===");
                        for (OrdemDeServico ordem : ordens) {
                            System.out.println(ordem);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID da ordem que deseja atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Escolha o novo status: ABERTA, EM_ANDAMENTO, CONCLUIDA");
                    String novoStatusStr = scanner.nextLine().toUpperCase();
                    StatusService novoStatus = StatusService.valueOf(novoStatusStr);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
