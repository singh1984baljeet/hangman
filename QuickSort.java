public class QuickSort {



    // Method to partition the array and return the pivot index
 
    private static int partition(int[] arr, int low, int high) {
 
        int pivot = arr[high]; // Choosing the rightmost element as pivot
 
        int i = (low - 1); // Index of smaller element
 
 
 
        for (int j = low; j < high; j++) {
 
            // If current element is smaller than or equal to pivot
 
            if (arr[j] <= pivot) {
 
                i++;
 
 
 
                // Swap arr[i] and arr[j]
 
                int temp = arr[i];
 
                arr[i] = arr[j];
 
                arr[j] = temp;
 
            }
 
        }
 
 
 
        // Swap arr[i+1] and arr[high] (or pivot)
 
        int temp = arr[i + 1];
 
        arr[i + 1] = arr[high];
 
        arr[high] = temp;
 
 
 
        return i + 1; // Return the partition index
 
    }
 
 
 
    // Method to perform quicksort
 
    private static void quickSort(int[] arr, int low, int high) {
 
        if (low < high) {
 
            // Partition the array and get the pivot index
 
            int pi = partition(arr, low, high);
 
 
 
            // Recursively sort elements before partition and after partition
 
            quickSort(arr, low, pi - 1);
 
            quickSort(arr, pi + 1, high);
 
        }
 
    }
 
 
 
    // Main method to run the quicksort
 
    public static void main(String[] args) {
 
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4}; // Initial array
 
 
 
        // Output the initial array
 
        System.out.println("Initial Array:");
 
        printArray(arr);
 
 
 
        // Perform quicksort
 
        quickSort(arr, 0, arr.length - 1);
 
 
 
        // Output the sorted array
 
        System.out.println("Sorted Array:");
 
        printArray(arr);
 
    }
 
 
 
    // Utility method to print the array
 
    private static void printArray(int[] arr) {
 
        for (int num : arr) {
 
            System.out.print(num + " ");
 
        }
 
        System.out.println();
 
    }
 
 }

 