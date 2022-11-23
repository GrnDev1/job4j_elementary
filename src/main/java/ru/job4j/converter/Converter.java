package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.86F;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.16F;
        return rsl;
    }

    public static void main(String[] args) {

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);

        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);

        in = 2;
        expected = 140;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euros are 140 rubles. Test result : " + passed);

        in = 2;
        expected = 120;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("2 dollars are 120 rubles. Test result : " + passed);

        in = 100;
        expected = 86;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("100 dollars are 86 euros. Test result : " + passed);

        in = 100;
        expected = 116;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("100 euros are 116 dollars. Test result : " + passed);

    }
}