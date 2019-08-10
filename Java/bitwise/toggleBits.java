import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class toggleBits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int tcase = 0; tcase < t; tcase++) {
            String[] inps = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inps[0]);
            int l = Integer.parseInt(inps[1]);
            int r = Integer.parseInt(inps[2]);
            // System.out.println(Integer.toBinaryString(n));
            char[] arr = Integer.toBinaryString(n).toCharArray();
            for (int i = l; i <= r; i++) {
                if (arr[i] == '1') {
                    arr[i] = '0';
                } else if (arr[i] == '0') {
                    arr[i] = '1';
                }
            }
            System.out.println(Integer.parseInt(new String(arr), 2));
        }
    }
}