package util;

import java.util.InputMismatchException;

public class Check {

    public static boolean isRomanChecker(String[] arrToCheck) {
        try {
            Integer.parseInt(arrToCheck[0]);
            Integer.parseInt(arrToCheck[2]);
        } catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }

    public static void rangeChecker(int[] digitsArr) {
        if ((digitsArr[0] < 1 || digitsArr[0] > 10) || (digitsArr[1] < 1 || digitsArr[1] > 10))
            throw new InputMismatchException("Ошибка. Одно из чисел вне диапазона");
    }
}
