import java.util.*;

public class secMostFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        sc.close();
        Integer[] vec = new int[256];
        for (int i = 0; i < s.length(); i++) {
            vec[s.charAt(i)]++;
        }
        int largest = Collections.min(Arrays.asList(vec));
        int second_largest = vec[0];
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] > second_largest && vec[i] < largest){
                second_largest = vec[i];
            }
        }
    }
}