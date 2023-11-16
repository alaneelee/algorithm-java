package Day_10;

public class Programmers_47 {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);

        for (int i = e; i > s-1; i--) {
            answer += my_string.charAt(i);
        }

        answer += my_string.substring(e+1);

        return answer;
    }


    public static void main(String[] args) {
        Programmers_47 sol = new Programmers_47();
        System.out.println(sol.solution("Progra21Sremm3", 6, 12));
    }
}

