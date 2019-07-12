import java.util.ArrayList;
import java.util.List;

public class generateSubsets {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 2 };
        List<Integer> subset = new ArrayList<>();
        for (int i = 0; i < (1 << arr.length); i++) {
            subset.clear();
            for (int j = 0; j < arr.length; j++) {
                if((i & (1 << j)) != 0)
                    subset.add(j);
            }
            System.out.println(subset);
        }
        
    }
}