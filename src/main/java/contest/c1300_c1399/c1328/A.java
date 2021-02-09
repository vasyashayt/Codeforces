package contest.c1300_c1399.c1328;


import java.io.*;
import java.util.StringTokenizer;

// Задача о делимости
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a % b == 0) {
                out.println(0);
            } else {
                out.println(b - (a % b));
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
