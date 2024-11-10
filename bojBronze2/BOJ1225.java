package bojBronze2;

import java.util.Scanner;

public class BOJ1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        long result = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                result += (A.charAt(i) - '0') * (B.charAt(j) - '0');
            }
        }
        System.out.println(result);
    }
}
