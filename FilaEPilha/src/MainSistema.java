import java.util.Scanner;

public class MainSistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        // Dados iniciais da Fila de Atendimento
        Elemento[] filaAtendimento = new Elemento[]{
                new Elemento("CLI001", "Maria Silva", "Dúvida sobre produto"),
                new Elemento("CLI002", "João Souza", "Reclamação de serviço"),
                new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso"),
                new Elemento("CLI004", "Pedro Alves", "Informações de entrega"),
                new Elemento("CLI005", "Carla Dias", "Agendamento de visita"),
                new Elemento("CLI006", "Lucas Martins", "Alteração de pedido"),
                new Elemento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
                new Elemento("CLI008", "Rafael Lima", "Renovação de assinatura"),
                new Elemento("CLI009", "Fernanda Gomes", "Suporte para instalação"),
                new Elemento("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };

        // Dados iniciais do Histórico (Pilha)
        Elemento[] historico = new Elemento[]{
                new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"),
                new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
                new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
                new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"),
                new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
                new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
                new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
                new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"),
                new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"),
                new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00")
        };

        // Inicializa as estruturas
        for (int i = 0; i < 10; i++) {
            fila.insere(filaAtendimento[i]);
            pilha.insere(historico[i]);
        }

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== SISTEMA DE ATENDIMENTO =====");
            System.out.println("1 - Ver fila de atendimento");
            System.out.println("2 - Adicionar cliente à fila");
            System.out.println("3 - Atender próximo cliente");
            System.out.println("4 - Ver histórico de solicitações");
            System.out.println("5 - Adicionar nova solicitação ao histórico");
            System.out.println("6 - Remover última solicitação do histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    fila.imprime();
                    break;

                case 2:
                    System.out.println("Digite o ID do cliente:");
                    String id = sc.nextLine();
                    System.out.println("Digite o nome do cliente:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o motivo do atendimento:");
                    String motivo = sc.nextLine();

                    Elemento novoCliente = new Elemento(id, nome, motivo);
                    fila.insere(novoCliente);
                    System.out.println("Cliente adicionado à fila!");
                    break;

                case 3:
                    Elemento cliente = fila.remove();
                    if (cliente != null) {
                        System.out.println("\nCliente atendido:");
                        cliente.exibir();
                    }
                    break;

                case 4:
                    pilha.imprime();
                    break;

                case 5:
                    System.out.println("Digite o ID da solicitação:");
                    String reqId = sc.nextLine();
                    System.out.println("Digite a descrição:");
                    String desc = sc.nextLine();
                    System.out.println("Digite a data e hora (ex: 2024-10-17 14:00):");
                    String data = sc.nextLine();

                    Elemento nova = new Elemento(reqId, desc, data);
                    pilha.insere(nova);
                    System.out.println("Solicitação adicionada ao histórico!");
                    break;

                case 6:
                    Elemento removido = pilha.remove();
                    if (removido != null) {
                        System.out.println("Solicitação removida:");
                        removido.exibir();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
