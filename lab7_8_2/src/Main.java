import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        int sum = calculateSumOfSquaresInRange(1,3);
        System.out.println("suma = " + sum);
    }
    static int calculateSumOfSquaresInRange(int startInclusive, int endInclusive) {
        if (endInclusive < startInclusive) {
            throw new IllegalArgumentException();
        }

        return IntStream.rangeClosed(startInclusive, endInclusive)
                .map(i -> i * i)
                .sum();
    }
}