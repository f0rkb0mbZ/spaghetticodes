import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class egyptianFraction {

    static void getFraction(float nr, float dr) {
        List<Integer> deno = new ArrayList<>();
        while (nr != 0) {
            int x = (int) Math.ceil(dr / nr);
            deno.add(x);
            nr = x * nr - dr;
            dr = dr * x;
        }
        for (int i = 0; i < deno.size(); i++) {
            if(i != deno.size() - 1){
                System.out.print("1/" + deno.get(i) + " + ");
            } else{
                System.out.print("1/" + deno.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int dr = sc.nextInt();
        sc.close();
        getFraction(nr, dr);
    }
}