package contest.c100_199.c136;


import java.io.*;
import java.util.StringTokenizer;

// Подарки
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            res[k - 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            out.print(res[i] + " ");
        }
    }

    public void run() {
        in = new FastScanner(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

    public static void main(String[] arg) {
        new A().run();
    }
}
