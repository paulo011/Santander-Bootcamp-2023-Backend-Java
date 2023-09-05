import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int firstParameter = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int secondParameter = terminal.nextInt();

        try {
            CounterParameter.count(firstParameter, secondParameter);

        }catch (InvalidParametersException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}