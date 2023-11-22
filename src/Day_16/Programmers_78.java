package Day_16;

public class Programmers_78 {
    public String solution(String myString) {
        return myString.toLowerCase().replaceAll("a","A");
    }

    public static void main(String[] args) {
        Programmers_78 sol = new Programmers_78();

        System.out.println(sol.solution("abstract algebra"));
    }
}