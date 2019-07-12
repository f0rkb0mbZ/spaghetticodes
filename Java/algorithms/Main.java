/**
 *
 * NOTE : Class Name should be Main 
 *
 **/
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> inputByLine = new ArrayList<String>();
        try {
            // Get the object of DataInputStream
            InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null){
                inputByLine.add(line.toString());
            }

            String spacefree = inputByLine.get(0).trim().replaceAll("\\s+", " ");
            System.out.println(spacefree);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}