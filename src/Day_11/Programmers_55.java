package Day_11;

import java.util.ArrayList;
import java.util.List;

public class Programmers_55 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if(n == 1) {
            for(int i =0; i<b+1; i++) {
                list.add(num_list[i]);
            }
        }else if(n == 2) {
            for(int i = a; i<num_list.length; i++) {
                list.add(num_list[i]);
            }
        }else if(n ==3) {
            for(int i = a; i<b+1; i++) {
                list.add(num_list[i]);
            }
        }else if(n == 4) {
            for(int i = a; i<b+1; i+=c) {
                list.add(num_list[i]);

            }
        }
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }


    public static void main(String[] args) {
        Programmers_55 sol = new Programmers_55();
        int[] slicer = {1,5,2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sol.solution(4, slicer, num_list));
    }
}

