package bojBronze3;

import java.util.Scanner;

public class BOJ10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp==1) count++;
        }
        if(count>n/2) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}
