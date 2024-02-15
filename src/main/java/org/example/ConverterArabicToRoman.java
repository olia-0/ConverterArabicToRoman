package org.example;

public class ConverterArabicToRoman {
    private static final int[] ARABIC_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN_SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convertToRoman(int number) {
        if (number <= 0 || number >= 4000000) {
            return null;
        }
        StringBuilder romanNumeral = new StringBuilder();
        int i = 0;
        while (number > 0) {
            if (number - ARABIC_VALUES[i] >= 0) {
                romanNumeral.append(ROMAN_SYMBOLS[i]);
                number -= ARABIC_VALUES[i];
            } else {
                i++;
            }
        }
        return romanNumeral.toString();
    }
}
