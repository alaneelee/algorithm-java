package Day_10;

public class Programmers_48 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i = 1; i <= my_string.length() / m; i++) {
            answer += my_string.substring((i-1)*m, i*m).charAt(c-1);
        }
        return answer;
    }


    public static void main(String[] args) {
        Programmers_48 sol = new Programmers_48();
        System.out.println(sol.solution("ihrhbakrfpndopljhygc", 4, 2));
    }
}

//
//class Solution {
//
//    public String solution(String my_string, int m, int c) {
//        String answer = "";
//
//        for (int i = c - 1; i < my_string.length(); i += m) {
//            answer += my_string.charAt(i);
//        }
//        return answer;
//    }
//}