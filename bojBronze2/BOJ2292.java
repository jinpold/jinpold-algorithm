package bojBronze2;

import java.util.Scanner;

public class BOJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int range = 1;
        while (range < N) {
            range += 6 * count;
            count++;
        }
        System.out.println(count);
    }

}