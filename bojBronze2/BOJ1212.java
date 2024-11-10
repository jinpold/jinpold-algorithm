package bojBronze2;

import java.util.*;
import java.io.*;

public class BOJ1212 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            String a = Integer.toBinaryString(s.charAt(i) - '0');
            if(a.length() == 2 && i != 0)
                a = "0" + a;
            else if(a.length() == 1 && i !=0)
                a = "00" + a;

            sb.append(a);
        }

        System.out.println(sb);
    }
}