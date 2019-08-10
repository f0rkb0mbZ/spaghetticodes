import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstSetBit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int tcase = 0; tcase < t; tcase++) {
            int num = Integer.parseInt(br.readLine().trim());
            String bString = Integer.toBinaryString(num);
            int pos = bString.lastIndexOf("1");
            if(pos != -1)
                System.out.println(bString.length() - pos);
            else
                System.out.println(0);
        }
    }
}