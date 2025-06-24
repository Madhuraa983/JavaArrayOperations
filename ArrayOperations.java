import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        sortArray(numbers);
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSecond Lowest: " + findSecondLowest(numbers));
        System.out.println("Second Highest: " + findSecondHighest(numbers));
    }

    public static void sortArray(int[] arr) {
        // Sorting logic - updated in sorting-logic branch
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static int findSecondLowest(int[] arr) {
        int lowest = arr[0], secondLowest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != lowest) {
                secondLowest = arr[i];
                break;
            }
        }
        return secondLowest;
    }

    public static int findSecondHighest(int[] arr) {
        int highest = arr[arr.length - 1], secondHighest = Integer.MIN_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != highest) {
                secondHighest = arr[i];
                break;
            }
        }
        return secondHighest;
    }
}
