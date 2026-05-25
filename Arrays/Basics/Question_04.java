//move all negative number to one side 
public class Question_04 {

    public static void moveNegative(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            if(arr[left] < 0) {
                left++;
            }

            else if(arr[right] > 0) {
                right--;
            }

            else {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, -1, 4};

        moveNegative(arr);
    }
}