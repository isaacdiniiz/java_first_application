import java.util.Scanner;

public class ProjetoBank {
    public static void main(String[] args) {
        String nome = "Isaac Diniz";
        String tipoConta = "Corrente";
        double saldo = 2100;
        double valorAReceber;
        double valorATransferir;
        int opcaoDesejada;
        boolean manter = true;
        String mensagemInicial = """
                ********************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  R$%.2f
                ********************************************
                """.formatted(nome, tipoConta, saldo);

        String operacoes = """
                
                
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);

        System.out.println(mensagemInicial);
        while (manter) {
            System.out.println(operacoes);
            opcaoDesejada = leitura.nextInt();

            switch (opcaoDesejada) {
                case 1:
                    System.out.println("O saldo atual é R$" + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    valorAReceber = leitura.nextDouble();
                    saldo += valorAReceber;
                    System.out.println("Saldo atualizado: R$" + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    valorATransferir = leitura.nextDouble();
                    if (valorATransferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    } else {
                        saldo -= valorATransferir;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }
                    break;
                case 4:
                    manter = false;
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
}
