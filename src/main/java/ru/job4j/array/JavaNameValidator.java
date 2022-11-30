package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        if (name.isEmpty() || !isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (
                    Character.isDigit(array[i])
                            || isSpecialSymbol(name.codePointAt(i))
                            || isUpperLatinLetter(name.codePointAt(i))
                            || isLowerLatinLetter(name.codePointAt(i))
            ) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code <= 90 && code >= 65;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code <= 122 && code >= 97;
    }
}