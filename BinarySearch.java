import java.util.Scanner;

public class BinarySearch{

    public static int binarySearch(int[] A, int x) {
        int low = 0, high = A.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
      if (x ==A[mid]) return mid ;
      else if (x < A[mid]) high = mid-1 ;
      else low = mid +1 ;
        }
        return -1 ;
    }

    public static void main(string[]args){
        int[] A = {2, 4, 5, 7, 13, 14, 15, 23};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        int index = binarySearch(A, x);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    }