import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean voltar = true;

        System.out.println("""
                     ---------------------------
                    |       Criar Cliente       |
                     ---------------------------
                    """);

        System.out.println("Nome do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("codigo da agencia");
        String agencia = scanner.nextLine();

        System.out.println("saldo da conta");
        Double saldo = scanner.nextDouble();

        ContaTerminal conta = ContaTerminal.criarContaCliente(agencia, nomeCliente, saldo);
        System.out.println(conta);
    }
}