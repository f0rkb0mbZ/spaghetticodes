import java.util.Scanner;
import java.util.Arrays;

class questionDatabase {
    float ratio;
    int[] question;

    questionDatabase(float r, int[] q) {
        this.ratio = r;
        this.question = q;
    }

    int[] getQ(float r) {
        return this.question;
    }
}

public class maxMarks {

    static float[] reverse(float a[], int n) 
    { 
        float[] b = new float[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int t = sc.nextInt();
        int[] marks = new int[q];
        int[] time = new int[q];
        float[] ratio = new float[q];
        for (int i = 0; i < q; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            time[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < q; i++) {
            ratio[i] = (float)marks[i] / (float)time[i];
            // System.out.print((float)marks[i]/(float)time[i]);
        }

        for (int i = 0; i < q; i++) {
            System.out.print("\t" + ratio[i]);
        }

        questionDatabase[] qd = new questionDatabase[q];

        for (int i = 0; i < q; i++) {
            int[] temparr = new int[]{ marks[i], time[i] };
            qd[i] = new questionDatabase(ratio[i], temparr);
        }

        Arrays.sort(ratio);

        // ratio = reverse(ratio, ratio.length);

        int ttime = 0;
        int result = 0;
        for (int i = 0; i < q; i++) {
            int[] qu = qd[i].getQ(ratio[i]);
            ttime += qu[1];
            if (ttime <= t) {
                result += qu[0];
            }
        }

        System.out.println(result);
    }
}