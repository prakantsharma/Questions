// find missing number in an array 
public class Question_08 {

    public static void findMissing(int[] arr, int n) {

        if(arr == null || arr.length == 0) {
            System.out.println("Invalid Array");
            return;
        }

        int xor1 = 0;
        int xor2 = 0;

        for(int num : arr) {
            xor1 ^= num;
        }

        for(int i = 1; i <= n; i++) {
            xor2 ^= i;
        }

        int missing = xor1 ^ xor2;

        System.out.println("Missing Number: " + missing);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        int n = 5;

        findMissing(arr, n);
    }
}