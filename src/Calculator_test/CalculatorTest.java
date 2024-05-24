package Calculator_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Calculator.Calculator;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        // Add more test cases as needed
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(5, calculator.subtract(8, 3));
        // Add more test cases as needed
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        // Add more test cases as needed
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5)); // Handling division by zero
        // Add more test cases as needed
    }
}

