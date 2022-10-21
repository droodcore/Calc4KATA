package util;

import java.util.HashMap;
import java.util.Map;

public class Converter {

    public static int romanToArabic(String s) {

        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int number = 0;
        try {
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 == s.length() || values.get(s.charAt(i)) >= values.get(s.charAt(i + 1))) {
                    number += values.get(s.charAt(i));
                } else {
                    number -= values.get(s.charAt(i));
                }
            }
        } catch (NullPointerException npe) {
            throw new NullPointerException("Ошибка. Разные системы счисления членов");
        }
        return number;
    }
    public static String arabicToRoman(int number) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                s.append(romanLiterals[i]);
            }
        }
        return s.toString();
    }
}
