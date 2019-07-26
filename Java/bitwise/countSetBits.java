import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countSetBits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int tcase = 0; tcase < t; tcase++) {
            int num = Integer.parseInt(br.readLine().trim());
            int count = 0;
            for (int i = 0; i <= num; i++) {
                String bString = Integer.toBinaryString(i);
                for(int j =0;j<bString.length();j++){
                    if(bString.charAt(j) == '1')
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}