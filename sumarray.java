public class sumarray {
    public static void main(String[] args) {
        int[] array = { 2, 9, 8, 3, 4 };

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}