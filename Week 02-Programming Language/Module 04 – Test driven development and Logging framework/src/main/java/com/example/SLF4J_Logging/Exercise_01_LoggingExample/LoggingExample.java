package com.example.SLF4J_Logging.Exercise_01_LoggingExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public void logActivity() {
        logger.info("Conversion process started...");
    }
}
