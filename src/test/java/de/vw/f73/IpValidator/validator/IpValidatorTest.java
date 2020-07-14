package de.vw.f73.IpValidator.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IpValidatorTest {
    @Test
    public void shouldRunTests() {
        assertEquals(true, true);
    }

    @Test
    public void shouldReturnTrueWhenIpAdressIs1_1_1_1() {
        // SetUp
        String ipAddress = "1.1.1.1";
        IpValidator ipValidator = new IpValidator();
        // Exercise + Assertion
        assertTrue(ipValidator.validateIpv4Adress(ipAddress));
    }

    @Test
    public void shouldReturnFalseWhenIpAddressContainsLessThanThreeDots() {
        String wrongIpAddress = "1.1.1";

        IpValidator ipValidator = new IpValidator();
        // Exercise + Assertion
        assertFalse(ipValidator.validateIpv4Adress(wrongIpAddress));

    }

    @Test
    public void shouldReturnFalseWhenIpAddressContainsMoreThanThreeDots() {
        String wrongIpAddress = "1.1.1.1.1";

        IpValidator ipValidator = new IpValidator();
        // Exercise + Assertion
        assertFalse(ipValidator.validateIpv4Adress(wrongIpAddress));

    }

    // @Test
    // public void shouldReturnFalseWhenIpAddressContainsNothingBetweenTwoDots() {
    // String wrongIpAddress = "1.1..1";

    // IpValidator ipValidator = new IpValidator();
    // // Exercise + Assertion
    // assertFalse(ipValidator.validateIpv4Adress(wrongIpAddress));

    // }

    // @Test
    // public void
    // shouldReturnFalseWhenIpAddressContainsNotAnIntegerBetweenTwoDots() {
    // String wrongIpAddress = "1.1.A.1";
    // IpValidator ipValidator = new IpValidator();
    // // Exercise + Assertion
    // assertFalse(ipValidator.validateIpv4Adress(wrongIpAddress));
    // }
}
