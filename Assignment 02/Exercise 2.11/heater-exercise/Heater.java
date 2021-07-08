
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables.
    private int temperature;
    
    private int min;
    
    private int max;
    
    private int increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(int min, int max) {
        // Setting the default temperature to 15 (according to the
        // instructions).
        this.temperature = 15;
        this.increment = 5;
        this.min = min;
        this.max = max;
    }

    // Getter
    public int getTemperature() {
        return this.temperature;
    }
    
    // Setter
    public void setIncrement(int increment) {
        if (increment < 0) {
            System.out.println("Increment cannot be negative");
        } else {
            this.increment = increment;
        }
    }
    
    // Utility Methods
    public void warmer() {
        int newTemperature = temperature + increment;
        if (newTemperature > max) {
            System.out.println("Temperature cannot be higher than " + max);
        } else {
            temperature = newTemperature;
        }
    }
    
    public void cooler() {
        int newTemperature = temperature - increment;
        if (newTemperature < min) {
            System.out.println("Temperature cannot be lower than " + min);
        } else {
            temperature = newTemperature;
        }
    }
}
