package bojBronze3;

import java.util.Scanner;

public class BOJ10990 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        for(int i=1; i<=n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i>1) {
                for(int j=0; j<2*i-3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
