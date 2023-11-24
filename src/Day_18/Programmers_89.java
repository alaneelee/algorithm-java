package Day_18;


public class Programmers_89 {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m","rn");
    }

    public static void main(String[] args) {
        Programmers_89 sol = new Programmers_89();
        String[] strArr = {"and","notad","abcd"};

        System.out.println(sol.solution("programmers"));
    }
}

// myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
//        return myString.contains(pat) ? 1 : 0;