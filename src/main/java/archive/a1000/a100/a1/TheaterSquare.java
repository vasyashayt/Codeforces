package archive.a1000.a100.a1;

import java.io.*;
import java.util.StringTokenizer;

public class TheaterSquare {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int nMod = n % a == 0 ? n / a : n / a + 1;
        int mMod = m % a == 0 ? m / a : m / a + 1;
        long res = (long) nMod * mMod;
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
        new TheaterSquare().run();
    }
}
