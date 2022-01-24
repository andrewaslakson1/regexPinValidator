package com.revature.regexPinValidator.PinValidator;

public class PinValidator {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d\\d\\d\\d?\\d?\\d");
    }
}
