package bojBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int r = 0;
            int a = 0;

            while (true) {
                String s = br.readLine();
                if (s.equals("")) { break; }

                r += s.replaceAll("#", "").length();
                a += s.length();
            }
            double recognitionRate = (double) r / a * 100;
            recognitionRate = Math.round(recognitionRate * 10) / 10.0;

            if (recognitionRate == (int) recognitionRate) {
                System.out.printf("Efficiency ratio is %d%%.\n", (int) recognitionRate);
            } else {
                System.out.printf("Efficiency ratio is %.1f%%.\n", recognitionRate);
            }
        }
    }
}
