package com.example.cognizant.spring_learn.Hands_on_1_Exercise_4.code;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication1{

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication1.class);

    public static void main(String[] args) {
        enableDebugLogs();

        LOGGER.info("=== Application Started ===");
        loadAndDisplayCountry();
        LOGGER.info("=== Application Ended ===");
    }

    private static void enableDebugLogs() {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        context.getLogger("com.cognizant").setLevel(Level.DEBUG);
    }

    private static void loadAndDisplayCountry() {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    @SuppressWarnings("unchecked")
    List<Country> countries = (List<Country>) context.getBean("countryList");

    System.out.println("Loaded Country List:");
    for (Country c : countries) {
        System.out.println("- " + c.getName() + " (" + c.getCode() + ")");
        LOGGER.debug("Country Bean: {}", c);
    }
}
}




