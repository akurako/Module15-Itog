import java.util.ArrayList;
import java.util.Random;

public class Generator {
    public ArrayList<Integer> list = new ArrayList<>();

    public Generator() {
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            list.add(rand.nextInt(1000000));
        }
    }

    public SmallestNumber getSmallestNumber() {
        return new SmallestNumber(list);
    }


    public class SmallestNumber {
        int number = 1000000;

        public SmallestNumber(ArrayList<Integer> list) {

            for (Integer i : list) {
                if (i < number) {
                    number = i;
                }
            }
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }
    }
}


