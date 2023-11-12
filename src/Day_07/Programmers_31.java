package Day_07;

import java.util.ArrayList;

public class Programmers_31 {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = l; i<=r; i++) {
            if (i % 5 == 0){
                String str = Integer.toString(i);
                int cnt = 0;
                for (char s : str.toCharArray()) {
                    if (s == '5' || s == '0') {
                        cnt ++;
                    }
                }
                if (cnt == str.length()) {
                    answer.add(i);
                }
            }
        }

        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_31 sol = new Programmers_31();
        System.out.println(sol.solution(5, 555555));
    }
}


//import java.util.ArrayList;
//
//class Solution {
//    public int[] solution(int l, int r) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i < 64; i++) {
//            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
//            if (l <= num && num <= r)
//                list.add(num);
//        }
//
//        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
//    }