package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double diffPowX = Math.pow((x2 - x1), 2);
        double diffPowY = Math.pow((y2 - y1), 2);
        double rsl = Math.sqrt(diffPowX + diffPowY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 6, 9, 9);
        System.out.println("Distance between points (0, 0) to (2, 0): " + result);
    }
}