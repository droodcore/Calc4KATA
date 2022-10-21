import util.Check;
import util.Converter;

import java.util.InputMismatchException;

public class Calc {
    public static String calc(String toCalc) throws InputMismatchException {
        String[] charArr = toCalc.split(" ");

        if (charArr.length != 3) {
            throw new InputMismatchException("Ошибка. Формат не соответствует заданному.");
        }

        int[] digits = new int[2];

        try {
            digits[0] = Integer.parseInt(charArr[0]);
            digits[1] = Integer.parseInt(charArr[2]);
        } catch (NumberFormatException nfe) {
            digits[0] = Converter.romanToArabic(charArr[0]);
            digits[1] = Converter.romanToArabic(charArr[2]);

        }
        Check.rangeChecker(digits);

        int result;

        switch (charArr[1]) {
            case ("+"):
                result = digits[0] + digits[1];
                break;
            case ("-"):
                result = digits[0] - digits[1];
                break;
            case ("*"):
                result = digits[0] * digits[1];
                break;
            case ("/"):
                result = digits[0] / digits[1];
                break;
            default:
                throw new ArithmeticException("Ошибка. Введена недопустимая арифметическая операция");
        }

        if (Check.isRomanChecker(charArr)) {
            return Converter.arabicToRoman(result);
        } else
            return String.valueOf(result);
    }
}
