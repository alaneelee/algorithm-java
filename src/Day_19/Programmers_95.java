package Day_19;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_95 {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i1 : arr) {
            list.add(i1);
        }

        int i = 1;

        while(arr.length >= i) {
            if (arr.length == i) {
                return list.stream().mapToInt(Integer::intValue).toArray();
            }
            i *= 2;
        }

        while (list.size() < i) {
            list.add(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Programmers_95 sol = new Programmers_95();

        int[] arr = {1,2,3,4,5,6};

        System.out.println(sol.solution(arr));
    }
}


//class Solution {
//    public int[] solution(int[] arr) {
//        int length = 1;
//
//        while (length < arr.length) {
//            length *= 2;
//        }
//
//        return Arrays.copyOf(arr, length);
//    }
//}