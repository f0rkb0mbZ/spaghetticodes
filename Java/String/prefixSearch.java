import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prefixSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int tcase = 0; tcase < t; tcase++) {
            String st1 = br.readLine().trim();
            String st2 = br.readLine().trim();
            String regexp = new String();
            int loc = -1;
            int prevloc = 0;
            for (int i = 0; i < st1.length(); i++) {
                regexp = st1.substring(0, i);
                loc = st2.indexOf(regexp);
                if (loc >= prevloc)
                    prevloc = loc;
                if(regexp.length()+prevloc >= st2.length())
                    break;
            }
            System.out.println(String.valueOf(prevloc) + " " + regexp);
            regexp = "";
        }
    }
}