package ru.mirea.task1.opt5;

public class Opt5 {
    public static void harmonic_series() {
        System.out.println("First 10 items of harmonic series:");
        for (float i = 1; i <= 10; i++)
            System.out.println("1 / " + (int) i + " = " + 1 / i);
    }

    public static void main(String[] args) {
        harmonic_series();
    }
}