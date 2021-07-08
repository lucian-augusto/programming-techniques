
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // Variable that holds a person's name.
    private String name;
    
    // Variable that holds the age of a person.
    private int age;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Utilities
    public void printDetails() {
        System.out.println("The name of this person is: " + name + "\n" +
        name + " is " + age + " years old.");
    }
}
