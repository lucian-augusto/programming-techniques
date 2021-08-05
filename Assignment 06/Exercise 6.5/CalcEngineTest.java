

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CalcEngineTest.
 *
 * @author  Lucian Augusto
 * @version 1.0
 */
public class CalcEngineTest
{
    /**
     * Test the plus operation of the engine.
     * validating the result of 3+4.
     */
    @Test
    public void testPlus() {
        CalcEngine engine = new CalcEngine();

        engine.clear();

        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();

        assertEquals(7, engine.getDisplayValue());
    }

    /**
     * Test the minus operation of the engine.
     * validates the result of 9 - 4.
     */
    @Test
    public void testMinus() {
        CalcEngine engine = new CalcEngine();
 
        engine.clear();

        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();

        assertEquals(5, engine.getDisplayValue());
    }
}
