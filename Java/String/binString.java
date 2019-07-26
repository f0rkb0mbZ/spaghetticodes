import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < t; i++) {
            int size = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] substrs = new String[s.length() * (s.length() + 1) / 2];
            for (int j = 0; j < s.length(); j++) {
                substrs[j] = s.substring(j, s.length() - 1);
            }
            int count = 0;
            for (int j = 0; j < substrs.length; j++) {
                String check = substrs[j];
                System.out.println(check);
                // if(check.charAt(0) == '1' && check.charAt(check.length() - 1) == '1'){
                //     count++;
                
            }
            // System.out.println(count);
        }
    }
}