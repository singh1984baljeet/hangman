import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 1, 6, 2};

        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int target = input.nextInt();

        int foundIndex = linearSearch(arr, target);

        if (foundIndex != -1) {
            System.out.println("Number " + target + " found at index " + foundIndex);
        } else {
            System.out.println("Number " + target + " not found in the array");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }
}