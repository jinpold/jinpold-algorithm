package bojBronze1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String a;
        while ((a = br.readLine()).charAt(0) != '#') {
            boolean flag = true;
            String b;
            while ((b = br.readLine()).charAt(0) != '#') {
                if (flag && !isCorrect(a, b)) flag = false;
                a = b;
            }
            sb.append(flag ? "Correct\n" : "Incorrect\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }

    private static boolean isCorrect(String a, String b) {
        if (a.equals(b) || a.length() != b.length()) return false;
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) if (++cnt > 1) return false;

        return true;
    }

}
