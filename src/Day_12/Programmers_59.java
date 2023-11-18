package Day_12;

import java.util.Arrays;

public class Programmers_59 {
    public int[] solution(int[] arr, int[] query) {
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Programmers_59 sol = new Programmers_59();
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        System.out.println(sol.solution(arr,query));
    }
}

