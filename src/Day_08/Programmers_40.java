package Day_08;

import java.util.ArrayList;

public class Programmers_40 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> nums = new ArrayList<>();

        for (String intStr : intStrs) {
            String substr = intStr.substring(s, s+l);
            if (Integer.parseInt(substr) > k) {
                nums.add(Integer.parseInt(substr));
            }
        }
        answer = nums.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }


    public static void main(String[] args) {
        Programmers_40 sol = new Programmers_40();
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        System.out.println(sol.solution(intStrs,50000,5,5));
    }
}



