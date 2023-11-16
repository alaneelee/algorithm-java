package Day_10;

public class Programmers_46 {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }


    public static void main(String[] args) {
        Programmers_46 sol = new Programmers_46();
        System.out.println(sol.solution("banana", "ban"));
    }
}

