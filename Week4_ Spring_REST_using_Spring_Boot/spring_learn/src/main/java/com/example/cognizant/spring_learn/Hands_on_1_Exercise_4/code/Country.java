package com.example.cognizant.spring_learn.Hands_on_1_Exercise_4.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        LOGGER.debug("Country object instantiated.");
    }

    public String getCode() {
        LOGGER.debug("Getter called: getCode()");
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("Setter called: setCode()");
        this.code = code;
    }

    public String getName() {
        LOGGER.debug("Getter called: getName()");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Setter called: setName()");
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Country [code='%s', name='%s']", code, name);
    }
}
