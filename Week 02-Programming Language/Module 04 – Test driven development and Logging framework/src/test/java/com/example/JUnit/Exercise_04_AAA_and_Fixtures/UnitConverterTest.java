package com.example.JUnit.Exercise_04_AAA_and_Fixtures;

import com.example.UnitConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitConverterTest {
    UnitConverter converter;

    @BeforeEach
    void setUp() {
        converter = new UnitConverter();
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
    }
}
