public class ArrayDifference {
    public static void main(String[] args) {
        int[] numbers = {2,9,8,3,4};

        // Calculate and print the differences between each pair
        for (int i = 0; i < numbers.length; i++) {
             
                int difference = numbers[i] - numbers[i+1];
                System.out.println("Difference between " + numbers[i] + " and " + numbers[i+1] + " is " + difference);
            
        }
    }
}


