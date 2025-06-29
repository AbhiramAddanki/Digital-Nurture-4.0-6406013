package com.example.Mockito.Exercise_01_Mocking_and_Verifying;

import com.example.Mockito.Exercise_02_Verifying_Interactions.ExternalService;
import com.example.Mockito.Exercise_02_Verifying_Interactions.UnitConversionService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UnitConversionServiceTest {

    @Test
    void testMockedConversionLogging() {
        ExternalService mockService = mock(ExternalService.class);
        when(mockService.log("distance")).thenReturn("logged: distance");

        UnitConversionService service = new UnitConversionService(mockService);
        String result = service.recordConversion("distance");

        verify(mockService).log("distance");
        assertEquals("logged: distance", result);
    }
}
