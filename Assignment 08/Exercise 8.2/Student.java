
/**
 * The Student class represents a student in a student administration system. It
 * holds the student details relevant in our context.
 * 
 * @author Michael Kolling and David Barnes
 * @version 2001.05.24
 */
public class Student extends Person {

    private int credits;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID) {
        super(fullName, studentID);
        credits = 0;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints) {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination of the
     * first four characters of the student's name and the first three characters of
     * the student's ID number.
     */
    public String getLoginName() {
        return this.getName().substring(0, 4) + this.getId().substring(0, 3);
    }

    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(this.getName() + " (" + this.getId() + ")");
    }
}
