package com.example.Mockito.Exercise_02_Verifying_Interactions;

public class UnitConversionService {
    private final ExternalService externalService;

    public UnitConversionService(ExternalService externalService) {
        this.externalService = externalService;
    }

    public String recordConversion(String type) {
        return externalService.log(type);
    }
}
