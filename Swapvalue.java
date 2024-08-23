public class Swapvalue {
    public static void main(String[] args) {
        int[] arr1 = {2, 9, 8, 3, 4};  
        int[] arr2 = {5, 3, 6, 8, 1};  
  
        

        int[] temp = arr1;  
        arr1 = arr2;  
        arr2 = temp;  

        System.out.println("After swapping:");  
        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));  
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2)); 
    }
}
