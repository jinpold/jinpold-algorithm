package bojBronze3;

import java.util.Scanner;

public class BOJ9295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i < T+1; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case " + i + ": " + (A+B));
        }
        sc.close();
    }
}
