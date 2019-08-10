
import java.util.*;

public class pangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        HashMap<Character, Integer> charcount = new HashMap<>();
        for(int i = 97;i<123;i++){
            charcount.put((char) i, 0);
        }
        for(int i =0;i<s.length();i++){
            char temp = s.charAt(i);
            if(charcount.containsKey(temp)){
                charcount.put(temp, charcount.get(temp)+1);
            }
        }
        
        if(charcount.containsValue(0)){
            System.out.println("Not a pangram.");
        }else{
            System.out.println("Its a pangram.");
        }
        sc.close();
    }
}