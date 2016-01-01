package me.timtim17.dev.java.apcs.projectstructuretest.project2;

public class OtherProject {
    public static void main(String[] args) {
        System.out.printf("1.24 * pi = %.3f%n1,000,000 / pi = %.3f", multiplyByPi(1.24), divideByPi(1000000));
    }

    /**
     * Takes in a value and multiplies it by pi.
     *
     * @param value Value to multiply by pi.
     * @return      The value multiplied by pi.
     */
    public static double multiplyByPi(double value) {
        return Math.PI * value;
    }

    /**
     * Takes in a value and divides it by pi.
     *
     * @param value Value to divide by pi.
     * @return      The value divided by pi.
     */
    public static double divideByPi(double value) {
        return value / Math.PI;
    }
}
