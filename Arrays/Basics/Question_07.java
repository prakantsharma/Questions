// find duplicate in an array .
import java.util.HashSet;

public class Question_07 {

    public static void findDuplicates(int[] arr) {

        if(arr == null || arr.length == 0) {
            System.out.println("Invalid Array");
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr) {

            if(set.contains(num)) {
                duplicates.add(num);
            }

            else {
                set.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        findDuplicates(arr);
    }
}