package bojBronze5;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N/4;
        for(int i =0; i<num; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
