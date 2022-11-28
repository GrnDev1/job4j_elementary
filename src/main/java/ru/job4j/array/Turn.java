package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = temp;
            if ((array.length - 1) / 2 == i) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int s : array
             ) {
            System.out.print(s + " ");
        }
        System.out.println();
        back(array);
        for (int s : array
        ) {
            System.out.print(s + " ");
        }
    }
}