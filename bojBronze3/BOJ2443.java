package bojBronze3;

import java.util.Scanner;

public class BOJ2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <2*N-1-i; j++) {
                if (j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
