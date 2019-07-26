import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countChars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int tcase = 0; tcase < t; tcase++) {
            String s = br.readLine().trim();
            String[] inps = br.readLine().trim().split("\\s+");
            int k = Integer.parseInt(inps[0]);
            int n = Integer.parseInt(inps[1]);
            char srch = inps[2].toCharArray()[0];
            StringBuffer sb = new StringBuffer();
            int count = 0;
            for (int i = 0; i < k; i++) {
                sb.append(s);
            }
            for (int i = 0; i < n; i++) {
                if(sb.charAt(i) == srch)
                    count++;
            }
            System.out.println(count);
        }
    }
}