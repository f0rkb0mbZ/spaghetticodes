import java.util.Scanner;

public class guessWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s_arr = s.toCharArray();
        boolean[] qvec = new boolean[s_arr.length];
        for (int i = 0; i < qvec.length; i++) {
            if (s_arr[i] == '?') {
                qvec[i] = true;
                s_arr[i] = 'a';
            }
        }

        for (int i = 1; i < s_arr.length; i++) {
            if(qvec[i] && s_arr[i] == 'a' && s_arr[i-1] == 'a'){
                s_arr[i] = 'b';
            }
        }
        
        for (int i = 0; i < s_arr.length - 1; i++) {
            if(qvec[i] && s_arr[i] == 'a' && s_arr[i+1] == 'a'){
                s_arr[i] = 'b';
            }
        }

        
        System.out.println(new String(s_arr));
    }
}