// find max and min element in an array 
public class Question_10 {

    public static void findMaxMin(int[] arr) {

        if(arr == null || arr.length == 0) {
            System.out.println("Invalid Array");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 1, 9, 3};

        findMaxMin(arr);
    }
}