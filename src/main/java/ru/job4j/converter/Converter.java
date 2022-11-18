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

        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euros. Test result : " + passed1);

        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed2);

        float in3 = 2;
        float expected3 = 140;
        float out3 = Converter.euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("2 euros are 140 rubles. Test result : " + passed3);

        float in4 = 2;
        float expected4 = 120;
        float out4 = Converter.dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("2 dollars are 120 rubles. Test result : " + passed4);

        float in5 = 100;
        float expected5 = 86;
        float out5 = Converter.dollarToEuro(in5);
        boolean passed5 = expected5 == out5;
        System.out.println("100 dollars are 86 euros. Test result : " + passed5);

        float in6 = 100;
        float expected6 = 116;
        float out6 = Converter.euroToDollar(in6);
        boolean passed6 = expected6 == out6;
        System.out.println("100 euros are 116 dollars. Test result : " + passed6);

    }
}