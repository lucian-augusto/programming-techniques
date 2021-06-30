
/**
 * This class contains the main method and only executes the tasks related to 
 * the exercise 1.3 of the Assignment 01
 *
 * @author Lucian Augusto
 */
public class LabClassExecutor {
    public static void main (String[] args) {
        // Creating the lab
        int numberOfStudents = 10;
        LabClass lab = new LabClass(numberOfStudents);
        
        // Setting the lab's instructor
        String instructorName = "Lucian Augusto";
        lab.setInstructor(instructorName);
        
        // Setting the lab's room number
        String roomNumber = "777";
        lab.setRoom(roomNumber);
        
        // Setting the lecture's time
        String lectureTime = "10:00 AM";
        lab.setTime(lectureTime);
        
        // Enrolling some students to the lab
        fillClassList(lab, numberOfStudents);    
        lab.printList();
    }
    
    /**
     * Private method that creates a number of students and enrolls them in a
     * a lab class
     */
    private static void fillClassList(LabClass lab, int numberOfEnrolledStudents) {
        for(int i=0; i < numberOfEnrolledStudents; i++) {
            lab.enrolStudent(new Student("Student "+ i, String.valueOf(i)));
        }
    }
}
