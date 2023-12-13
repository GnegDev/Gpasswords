package com.gnegdev.gpasswords;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";
    private static final String NUMERIC_CHARACTERS = "0123456789";

    public static String generateRandomPassword(int length, boolean includeNumbers, boolean includeUppercaseChars, boolean includeSpecialChars) {
        StringBuilder password = new StringBuilder();
        String validChars = LOWERCASE_CHARACTERS;

        if (includeUppercaseChars) {
            validChars += UPPERCASE_CHARACTERS;
        }
        if (includeSpecialChars) {
            validChars += SPECIAL_CHARACTERS;
        }
        if (includeNumbers) {
            validChars += NUMERIC_CHARACTERS;
        }

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            char randomChar = validChars.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}
