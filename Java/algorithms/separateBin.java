
/**
 *
 * NOTE : Class Name should be Main 
 *
 **/
import java.io.*;
import java.util.*;

class separateBin {
    public static void main(String[] args) throws InterruptedException {
        List<String> inputByLine = new ArrayList<String>();
        try {
            // Get the object of DataInputStream
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                inputByLine.add(line.toString());
            }
            isr.close();

            String s = inputByLine.get(0);
            int onecount = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1'){
                    onecount++;
                }
            }
            String op = new String();
            for(int i = 0;i<s.length();i++){
                if(onecount != 0){
                    op += "1";
                    onecount--;
                } else {
                    op += "0";
                }
            }

            System.out.println(op);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}