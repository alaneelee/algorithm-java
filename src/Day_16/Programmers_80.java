package Day_16;

public class Programmers_80 {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = i + 1; j <= my_string.length(); j++) {
                String sub = my_string.substring(i, j);
                if (sub.endsWith(alp) && sub.length() > answer.length()) {
                    answer = sub;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_80 sol = new Programmers_80();

        System.out.println(sol.solution("AbCdEFG", "dE"));
    }
}


//class Solution {
//    public String solution(String myString, String pat) {
//        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
//    }
//}