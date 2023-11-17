package Day_11;

public class Programmers_52 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] c = my_string.toCharArray();

        for (int index : indices) {
            c[index] = ' ';
        }

        return new String(c).replace(" ", "");
    }


    public static void main(String[] args) {
        Programmers_52 sol = new Programmers_52();
        int[] arr = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(sol.solution("apporoograpemmemprs", arr));
    }
}

