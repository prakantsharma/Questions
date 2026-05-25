// check an array is sorted or not 
public class Question_09 {

    public static boolean isSorted(int[] arr) {

        if(arr == null || arr.length == 0) {
            return false;
        }

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 10, 4, 5};

        System.out.println(isSorted(arr));
    }
}