package com.example.Mockito.Exercise_02_Verifying_Interactions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitConversionServiceExercise02Test {

    @Test
    void testRecordConversion() {
        // Provide a real implementation of ExternalService
        ExternalService realService = new ExternalService() {
            @Override
            public String log(String type) {
                return "REAL: " + type;
            }
        };

        UnitConversionService service = new UnitConversionService(realService);
        String result = service.recordConversion("length");

        assertEquals("REAL: length", result);
    }
}
