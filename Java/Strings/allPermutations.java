    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class allPermutations {
        static String swap(String s, int i, int j) {
            char tmp;
            char[] temparr = s.toCharArray();
            tmp = temparr[i];
            temparr[i] = temparr[j];
            temparr[j] = tmp;
            return String.valueOf(temparr);
        }

        static void permute(String s, int si, int ei) {
            if (si == ei)
                System.out.print(s+" ");
            else {
                for (int i = si; i <= ei; i++) {
                    s = swap(s, si, i);
                    permute(s, si + 1, ei);
                    s = swap(s, si, i);
                }
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            for(int i=0;i<t;i++){
                String s = br.readLine().trim();
                permute(s, 0, s.length() - 1);
                System.out.println();
            }
            br.close();
        }
    }