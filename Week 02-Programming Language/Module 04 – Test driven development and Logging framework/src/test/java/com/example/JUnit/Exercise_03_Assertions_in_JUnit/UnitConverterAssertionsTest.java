package com.example.JUnit.Exercise_03_Assertions_in_JUnit;

import com.example.UnitConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitConverterAssertionsTest {
    UnitConverter conv = new UnitConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(98.6, conv.celsiusToFahrenheit(37), 0.1);
    }

    @Test
    void testMetersToKilometers() {
        assertEquals(1.5, conv.metersToKilometers(1500), 0.01);
    }

    @Test
    void testKgToPounds() {
        assertEquals(22.0462, conv.kgToPounds(10), 0.0001);
    }
}
