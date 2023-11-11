package Day_05;

import java.util.Arrays;

public class Programmers_25 {

    public int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for (int num : num_list) {
            String numStr = Integer.toString(num);
            if (num % 2 == 0) {
                even += numStr;
            } else {
                odd += numStr;
            }
        }

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }

    public static void main(String[] args) {
        Programmers_25 sol = new Programmers_25();
        int[] arr = {3,4,5,2,1};

        System.out.println(sol.solution(arr));
    }
}

/*
public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd= "";
        for(int i : num_list) {
            if(i%2==0) even += i + "";
            else odd += i + "";
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
 */