import java.util.Random;

/**
 * @author Lucian Augusto
 * @version (a version number or a date)
 */
public class RandomTester
{
    private int maxRange;

    public RandomTester(int maxRange) {
        this.maxRange = maxRange;
    }
    
    public RandomTester() {
        this(100);
    }

    public void printOneRandom() {
        Random r = new Random();
        System.out.println(r.nextInt(maxRange + 1));
    }
    
    public void printMultiRandom(int howMany) {
        for (int i = 0; i < howMany; i++) {
            printOneRandom();
        }
    }
}
