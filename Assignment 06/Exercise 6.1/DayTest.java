

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DayTest.
 *
 * @author  Lucian Augusto
 * @version 1.0
 */
public class DayTest {
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    @Test
    public void makeAppointment() {
        Day day = new Day(1);
        Appointment appointment = new Appointment("description", 2);
        assertTrue(day.makeAppointment(9, appointment));
    }
    
    @Test
    public void makeAppointmentFinalAppointmentTime() {
        Day day = new Day(1);
        Appointment appointment = new Appointment("description", 2);
        assertFalse(day.makeAppointment(17, appointment));
    }
    
    @Test
    public void makeAppointmentSameTime() {
        Day day = new Day(1);
        Appointment appointment1 = new Appointment("description", 1);
        Appointment appointment2 = new Appointment("description", 1);
        assertTrue(day.makeAppointment(10, appointment1));
        assertFalse(day.makeAppointment(10, appointment2));
    }
    
    @Test
    public void makeAppointmentTimeOverlap() {
        Day day = new Day(1);
        Appointment appointment1 = new Appointment("description", 2);
        Appointment appointment2 = new Appointment("description", 1);
        assertTrue(day.makeAppointment(10, appointment1));
        assertFalse(day.makeAppointment(11, appointment2));
        assertTrue(day.makeAppointment(14, appointment2));
        assertFalse(day.makeAppointment(13, appointment1));
    }
}
