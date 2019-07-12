import java.io.*;

class tcs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] couple = br.readLine().split(" ");
        int counts = Integer.parseInt(couple[0]);
        int ttime = Integer.parseInt(couple[1]);
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int[] marks = new int[counts];
        int[] time = new int[counts];

        // Input
        for (int i = 0; i < counts; i++) {
            marks[i] = Integer.parseInt(a[i]);
            // smarks[i] = marks[i];
            time[i] = Integer.parseInt(b[i]);
        }

        // sub array approach
        int tempt = ttime;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < counts; i++) {
            tempt = ttime;
            sum = 0;
            for (int j = i; j < counts; j++) {
                if (tempt - time[j] >= 0) {
                    sum += marks[j];
                    tempt -= time[j];
                } else {
                    break;
                }
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}