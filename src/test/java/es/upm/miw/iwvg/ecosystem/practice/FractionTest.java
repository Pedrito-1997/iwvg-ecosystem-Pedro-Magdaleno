package es.upm.miw.iwvg.ecosystem.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    public void before() {
        fraction = new Fraction(1, 4);
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public void testFractionDecimal() {
        assertEquals(0.25, fraction.decimal());
    }


}
