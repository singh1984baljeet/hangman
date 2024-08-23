public class Array {
    public static void main(String[] args) {
        int[] array = { 2, 9, 8, 3, 4 };
        int reverse = array[0];
        for (int i = array.length - 1; i >= 0; i--) {  
            System.out.print(array[i] + " "); 

                reverse = array[i];
            }
        }

    }
