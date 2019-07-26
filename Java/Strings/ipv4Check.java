import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ipv4Check{

    static boolean crudeIPCheck(String s){
        String[] groups = s.split("\\.");
        boolean flag = true;
        if(groups.length == 4){
            for(String str: groups){
                try{
                if(!(str.length() <= 3 && str.matches("") && Integer.parseInt(str) >= 0 && Integer.parseInt(str) <= 255))
                    flag = false;
                
                } catch(NumberFormatException e){
                    return false;
                }
            }
        } else{
            flag = false;
        }
        return flag;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        // Pattern ipv4 = Pattern.compile("\\b(?:(?:25[0-5]|2[0-4]|[01]?\\d\\d?)\\.){3}(?:25[0-5]|2[0-4]|[01]?\\d\\d?)\\b");
        // Matcher m = ipv4.matcher(s);
        System.out.println(s.matches("\\b(?:(?:25[0-5]|2[0-4]\\d|[1]?\\d?\\d|[1-9]?\\d)\\.){3}(?:25[0-5]|2[0-4]|[1]?\\d?\\d|[1-9]?\\d)\\b"));
    }
}