package Day_05;

public class Programmers_21 {
    public String solution(String code) {
        String result = "";
        boolean flag = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (flag) {
                if (c == '1') {
                    flag = !flag;
                    continue;
                }
                if (i % 2 == 1) {
                    result += c;
                }
            } else {
                if (c == '1') {
                    flag = !flag;
                    continue;
                }
                if (i % 2 == 0) {
                    result += c;
                }
            }
        }

//        StringBuilder answer = new StringBuilder();
//        int mode = 0;
//        for (int i = 0; i < code.length(); i++) {
//            char current = code.charAt(i);
//            if (current == '1') {
//                mode = mode == 0 ? 1 : 0;
//                continue;
//            }
//
//            if (i % 2 == mode) {
//                answer.append(current);
//            }
        return result.isEmpty()? "EMPTY" : result;
    }
    public static void main(String[] args) {
        Programmers_21 sol = new Programmers_21();

        System.out.println(sol.solution("abc1abc1abc"));
    }
}