package bojBronze2;

import java.util.Scanner;

public class BOJ1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((N / 100 * 100 + i) % F == 0) {
                result = i;
                break;
            }
        }
        if (result < 10) {
            System.out.println("0" + result);
        } else {
            System.out.println(result);
        }
        sc.close();
    }
}
