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
        float rsl = value * 60 / 70;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 70 / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euroInRubles = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euroInRubles + " euro.");
        float dollarInRubles = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollarInRubles + " dollar.");
        float euroInRuble = Converter.euroToRuble(2);
        System.out.println("2 euros are " + euroInRuble + " ruble.");
        float dollarInRuble = Converter.dollarToRuble(2);
        System.out.println("2 dollars are " + dollarInRuble + " ruble.");
        float dollarInEuro = Converter.dollarToEuro(42);
        System.out.println("42 dollars are " + dollarInEuro + " euro.");
        float euroInDollar = Converter.euroToDollar(42);
        System.out.println("42 euros are " + euroInDollar + " dollar.");
    }
}