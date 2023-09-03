import java.util.Random;

public class ContaTerminal {
    private final Integer numero;
    private final String agencia;
    private String nomeCliente;
    private Double saldo;

    private ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public static ContaTerminal criarContaCliente(String agencia, String nomeCliente, Double saldo){
        Random rand = new Random();
        final Integer numero = rand.nextInt(1,99999);
        return new ContaTerminal(numero, agencia, nomeCliente, saldo);
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.";
    }

}
