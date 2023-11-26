package Day_20;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_96 {
    public int solution(int[] arr1, int[] arr2) {

        if (arr1.length == arr2.length) {
            if (Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()) {
                return 0;
            }
            return Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : -1;
        }

        return arr1.length > arr2.length ? 1 : -1;
    }

    public static void main(String[] args) {
        Programmers_96 sol = new Programmers_96();

        int[] arr1 = {49,13};
        int[] arr2 = {70,11,2};

        System.out.println(sol.solution(arr1,arr2));
    }
}
