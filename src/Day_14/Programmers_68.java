package Day_14;

import java.util.ArrayList;
import java.util.List;

public class Programmers_68 {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i=0; i<numbers.length; i++){
            answer+=numbers[i];

            if(answer>n)
                break;
        }
        return answer;
    }


    public static void main(String[] args) {
        Programmers_68 sol = new Programmers_68();
        int[] numbers = {58, 44, 27, 10, 100};
        System.out.println(sol.solution(numbers, 139));
    }
}

