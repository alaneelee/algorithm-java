package Day_15;

public class Programmers_74 {
    public int solution(String myString, String pat) {
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }

    public static void main(String[] args) {
        Programmers_74 sol = new Programmers_74();

        System.out.println(sol.solution("AbCdEfG", "aBc"));
    }
}