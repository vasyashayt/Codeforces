package contest.c1300_c1399.c1335;


import java.io.*;
import java.util.StringTokenizer;

// Конфеты и две сестры
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n > 2) {
                int count = 0;
                if (n % 2 == 0) {
                    count = n / 2 - 1;
                } else {
                    count = n / 2;
                }
                out.println(count);
            } else {
                out.println(0);
            }
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
