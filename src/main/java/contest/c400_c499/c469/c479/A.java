package contest.c400_c499.c469.c479;


import java.io.*;
import java.util.StringTokenizer;

// Выражение
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res1 = a + b + c;
        int res2 = a * b + c;
        int res3 = a + b * c;
        int res4 = a * b * c;
        int res5 = (a + b) * c;
        int res6 = a * (b + c);
        out.println(Math.max(Math.max(Math.max(Math.max(Math.max(res1, res2), res3), res4), res5), res6));
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
