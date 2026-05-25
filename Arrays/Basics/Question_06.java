// find the union and intersection of two arrays
import java.util.HashSet;

public class Question_06 {

    public static void unionIntersection(int[] arr1, int[] arr2) {
         if(arr1 == null || arr2 == null) {
            System.out.println("Invalid Array");
            return;
        }

        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num : arr1) {
            union.add(num);
        }

        for(int num : arr2) {

            if(union.contains(num)) {
                intersection.add(num);
            }

            union.add(num);
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};

        unionIntersection(arr1, arr2);
    }
}