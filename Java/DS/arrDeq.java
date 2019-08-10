import java.util.*;

public class arrDeq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        Set<Integer> uniq = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (i < m){
                deque.add(num);
                uniq.add(num);
            }
            if (i >= m ) {
                int rem = deque.removeFirst();
                if(!deque.contains(rem))
                    uniq.remove(rem);
                deque.addLast(num);
                uniq.add(num);
            }
            max = uniq.size() > max ? uniq.size() : max;
        }
        System.out.println(max);
        in.close();
    }
}
