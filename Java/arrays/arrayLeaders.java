import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.InputStreamReader;

public class arrayLeaders {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < t; i++) {
            int size = Integer.parseInt(br.readLine().trim());
            String[] ints = br.readLine().trim().split("\\s+");
            int[] arr = new int[size];
            boolean[] leader = new boolean[size];
            Arrays.fill(leader, true);
            for (int j = 0; j < size; j++) {
                arr[j] = Integer.parseInt(ints[j]);
            }
            int max = arr[size - 1];
            for (int j = size - 2; j >= 0; j--) {
                if(arr[j] >= max){
                    max = arr[j];
                } else{
                    leader[j] = false;
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < size; j++) {
                if (leader[j]) {
                    sb.append(arr[j] + " ");
                }
            }
            System.out.println(sb);
        }
    }
}