import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("Adding int values into a list of Integers objects (Autoboxing):");

        for (int i = 0; i < 10; i++) {
            int intValue = i;
            System.out.print(intValue + " ");
            list.add(intValue);
        }

        System.out.println();
        System.out.println("Printing int values using a list of Integers objects as source (Unboxing):");

        for (int i = 0; i < list.size(); i++) {
            printIntValue(list.get(i));
        }
    }

    private static void printIntValue(int value) {
        System.out.println(value);
    }
}
