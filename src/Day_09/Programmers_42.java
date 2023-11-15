package Day_09;

public class Programmers_42 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer += my_string.substring(my_string.length() - n);
        return answer;
    }


    public static void main(String[] args) {
        Programmers_42 sol = new Programmers_42();
        System.out.println(sol.solution("ProgrammerS123",11));
    }
}



