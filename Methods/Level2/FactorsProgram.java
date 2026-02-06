package Methods.Level2;

import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and return array
    static int[] findFactors(int num) {

        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create array with exact size
        int[] factors = new int[count];

        // Second loop → store factors
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int x=0;x<arr.length;x++) {
            sum += x;
        }
        return sum;
    }

    // Method to find product of factors
    static long productOfFactors(int[] arr) {
        long product = 1;
        for (int x=0;x<arr.length;x++) {
            product *= x;
        }
        return product;
    }

    // Method to find sum of squares of factors
    static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int x=0;x<arr.length;x++) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.println("\nFactors are:");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        System.out.println("\n\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
