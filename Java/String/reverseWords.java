import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < t; i++) {
            String[] words = br.readLine().trim().split("\\.");
            StringBuffer sb = new StringBuffer();
            for(int j = words.length - 1;j>=0;j--){
                if(j == 0)
                    sb.append(words[j]);
                else
                    sb.append(words[j]+".");
            }
            System.out.println(sb);
        }
    }
}