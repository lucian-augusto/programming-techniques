
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

    /**
     * Constructor for objects of class Heater
     */
    public Heater() {
        // Setting the default temperature to 15 (according to the
        // instructions).
        this.temperature = 15;
    }

    // Getter
    public int getTemperature() {
        return this.temperature;
    }
    
    // Utility Methods
    public void warmer() {
        temperature += 5;
    }
    
    public void cooler() {
        temperature -= 5;
    }
}
