package educational_codeforces_round_102;

import java.io.*;
import java.util.*;

public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int d = in.nextInt();
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int big = 0;
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                if (a > d) big++;
                if (a < min1) {
                    min1 = a;
                } else if (a <= min2) {
                    min2 = a;
                }
            }
            if (big == 0 || min1 + min2 <= d) out.println("YES");
            else out.println("NO");
        }
    }

    public void run() {
        try {
            in = new FastScanner(new InputStreamReader(System.in));
            out = new PrintWriter(new OutputStreamWriter(System.out));
            //in = new FastScanner(new File(".in"));
            //out = new PrintWriter(new File(".out"));

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStreamReader f) {
            br = new BufferedReader(f);
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] arg) {
        new A().run();
    }
}
