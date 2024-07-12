import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner digitarNumero = new Scanner(System.in);

        String nome = "Daniel";
        String tipoDeConta = "Corrente";
        int saldoDaConta;
        saldoDaConta = 1500;
        int valorAtualizado;


        String opcoes =
                """
                    Operações
                    \s
                     1- Consultar saldos
                     2- Depositar valor
                     3- Transferir valor
                     4- Sair
                     \s
                     Digite a opção desejada:
                """;

        System.out.println(opcoes);

        int escolherOpcao = digitarNumero.nextInt();
        boolean continuar = true;

        while (continuar) {

            String dadosDaConta =
                    """
                    ********************************
                    Dados iniciais do cliente:
                   \s
                    nome: %s
                    Tipo de conta: %s
                    Saldo da conta : %d
                    ********************************
                   """.formatted(nome,tipoDeConta,saldoDaConta);

            System.out.println(dadosDaConta);
            System.out.println(opcoes);

            switch (escolherOpcao) {
                case 1:
                    System.out.println("Saldo atual da conta");
                    System.out.println(saldoDaConta);
                    System.out.println("Digite a opção desejada:");
                    escolherOpcao = digitarNumero.nextInt();
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito");
                    int depositarValor = digitarNumero.nextInt();
                    if (depositarValor <= 0) {
                        System.out.println("Valor inválido");
                    }else {
                        valorAtualizado = saldoDaConta + depositarValor;
                        System.out.println("*********************");
                        saldoDaConta = valorAtualizado;
                        System.out.println("Saldo atual");
                        System.out.println(saldoDaConta);
                        System.out.println("*********************");
                    }
                    System.out.println(opcoes);
                    escolherOpcao = digitarNumero.nextInt();
                    break;

                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    int transferirValor = digitarNumero.nextInt();

                    if (transferirValor > saldoDaConta) {
                        System.out.println("saldo insuficiente");
                    }else {
                        valorAtualizado = saldoDaConta - transferirValor;
                        System.out.println("*********************");
                        saldoDaConta = valorAtualizado;
                        System.out.println("Saldo atual");
                        System.out.println(saldoDaConta);
                        System.out.println("*********************");
                    }
                    System.out.println(opcoes);
                    escolherOpcao = digitarNumero.nextInt();
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("opção inválida");
            }
        }
    }
}

