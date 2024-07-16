package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Mathima6Askisi6B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Εισάγετε έξι ακεραίους από 1 έως 49:");

        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
            while (numbers[i] < 1 || numbers[i] > 49) {
                System.out.println("Ο αριθμός πρέπει να είναι από 1 έως 49. Προσπαθήστε ξανά:");
                numbers[i] = scanner.nextInt();
            }
        }

        if (isValid(numbers)) {
            System.out.println("Η εξάδα περνάει από τα φίλτρα.");
        } else {
            System.out.println("Η εξάδα δεν περνάει από τα φίλτρα.");
        }
    }

    public static boolean isValid(int[] numbers) {
        return !hasMoreThanThreeEvens(numbers) &&
                !hasMoreThanThreeOdds(numbers) &&
                !hasMoreThanThreeConsecutive(numbers) &&
                !hasMoreThanThreeSameEnding(numbers) &&
                !hasMoreThanThreeInSameDecade(numbers);
    }

    public static boolean hasMoreThanThreeEvens(int[] numbers) {
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) evenCount++;
            if (evenCount > 3) return true;
        }
        return false;
    }

    public static boolean hasMoreThanThreeOdds(int[] numbers) {
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) oddCount++;
            if (oddCount > 3) return true;
        }
        return false;
    }

    public static boolean hasMoreThanThreeConsecutive(int[] numbers) {
        java.util.Arrays.sort(numbers);
        int consecutiveCount = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1] + 1) {
                consecutiveCount++;
                if (consecutiveCount > 3) return true;
            } else {
                consecutiveCount = 1;
            }
        }
        return false;
    }

    public static boolean hasMoreThanThreeSameEnding(int[] numbers) {
        int[] endings = new int[10];
        for (int num : numbers) {
            endings[num % 10]++;
            if (endings[num % 10] > 3) return true;
        }
        return false;
    }

    public static boolean hasMoreThanThreeInSameDecade(int[] numbers) {
        int[] decades = new int[5];
        for (int num : numbers) {
            decades[num / 10]++;
            if (decades[num / 10] > 3) return true;
        }
        return false;
    }
}
