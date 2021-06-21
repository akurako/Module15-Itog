import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Generator.SmallestNumber> numbers = new ArrayList<>();
        int iterations = 1000;

        for (int i = 0; i < iterations; i++) {
            numbers.add(new Generator().getSmallestNumber());
            System.out.println("Calculated " + i + " of " + iterations);
        }

        for (Generator.SmallestNumber sn : numbers) {
            System.out.println(sn);
        }
    }
}
