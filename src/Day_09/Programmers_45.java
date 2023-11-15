package Day_09;

import java.util.Objects;

public class Programmers_45 {
    public String solution(String my_string, int n) {
        return my_string.substring(0,n);
    }


    public static void main(String[] args) {
        Programmers_45 sol = new Programmers_45();
        System.out.println(sol.solution("ProgrammerS123", 11));
    }
}


//class Solution {
//    public int solution(String myString, String isSuffix) {
//        return myString.endsWith(isSuffix) ? 1 : 0;
//    }
//}

