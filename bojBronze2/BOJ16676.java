package bojBronze2;

import java.util.Scanner;

public class BOJ16676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 0 && n <= 10) System.out.println(1);
        else {
            int k = 2;
            for(int i=11; true; i=i*10+1) {
                if(n >= i && n <= i*10) {
                    System.out.println(k);
                    break;
                }
                k++;
            }
        }
    }
}
