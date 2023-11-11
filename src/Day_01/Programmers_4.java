package Day_01;
import java.util.Scanner;

public class Programmers_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int c : a.toCharArray()) {
            if (c >= 97) {
                c -= 32;
                sb.append((char) c);
            } else {
                c += 32;
                sb.append((char) c);
            }
        }
        System.out.println(sb);
    }
}