package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("Enter the number you want to find the factorial of: ");
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();

        Factorial factorial = new Factorial();
        long number = factorial.factorial(value);
        System.out.println("Factorial of " + value + " is : " + number);
    }

    public long factorial(long x) {
        long number = 1;
        for (long i = 1; i <= x; i++) {
            number = number * i;
        }
        return number;

    }
}
