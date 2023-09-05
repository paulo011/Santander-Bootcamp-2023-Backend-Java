public class CounterParameter {
    static void count(int first, int second ) throws InvalidParametersException {
        if(first > second) throw new InvalidParametersException();
        int score = second - first;

        for(int i = 0; i < score; i++){
            System.out.println("Imprimindo o número [1]: " + first);
            System.out.println("Imprimindo o número [2]: " + second);
        }
    }
}
