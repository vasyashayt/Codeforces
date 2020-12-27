package archive.a1000.a200.a158;

import java.io.*;
import java.util.StringTokenizer;

public class NextRound {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int k = in.nextInt() - 1;
        int res = 0;
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (points[i] > 0 && points[i] >= points[k]) {
                res++;
            }
        }
        out.println(res);

    }

    public void run() {
        in = new FastScanner(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;


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

    public static void main(String[] args) {
        new NextRound().run();
    }
}
