package bojBronze5;

import java.math.BigInteger;
import java.util.Scanner;
public class BOJ10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B)); // BigInteger 출력  A+B를 좌측 출력과 같이 나타냄.
    }
}
