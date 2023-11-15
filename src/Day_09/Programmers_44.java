package Day_09;

import java.util.Arrays;
import java.util.Objects;

public class Programmers_44 {
    public int solution(String my_string, String is_suffix) {
        String[] suffix = new String[my_string.length()];
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            suffix[i] = my_string.substring(i);
            if(Objects.equals(suffix[i], is_suffix)) {
                answer = 1;
            }
        }



        return answer;
    }


    public static void main(String[] args) {
        Programmers_44 sol = new Programmers_44();
        System.out.println(sol.solution("banana", "ana"));
    }
}


//class Solution {
//    public int solution(String myString, String isSuffix) {
//        return myString.endsWith(isSuffix) ? 1 : 0;
//    }
//}

