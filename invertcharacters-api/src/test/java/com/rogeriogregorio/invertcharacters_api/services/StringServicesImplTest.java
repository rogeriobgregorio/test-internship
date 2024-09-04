package com.rogeriogregorio.invertcharacters_api.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringServicesImplTest {

    private final StringServiceImpl stringService = new StringServiceImpl();

    @Test
    public void testInvert() {
        // Arrange
        StringServiceImpl stringService = new StringServiceImpl();

        String input = "example";
        String expected = "elpmaxe";

        // Act and Assert
        String actual = stringService.invert(input);
        assertEquals(expected, actual, "The string should be reversed correctly.");

        input = "a!b@c#";
        expected = "#c@b!a";

        // Act and Assert
        actual = stringService.invert(input);
        assertEquals(expected, actual, "The string with special characters should be reversed correctly.");

        input = "";
        expected = "";

        // Act and Assert
        actual = stringService.invert(input);
        assertEquals(expected, actual, "An empty string should remain empty after inversion.");
    }
}
