package Day_16;

public class Programmers_79 {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        Programmers_79 sol = new Programmers_79();

        System.out.println(sol.solution("programmers", "p"));
    }
}