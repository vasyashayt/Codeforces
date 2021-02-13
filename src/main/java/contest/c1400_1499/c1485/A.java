package contest.c1400_1499.c1485;


import java.io.*;
import java.util.StringTokenizer;

//
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while(t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int move = 0;
            if (b == 1) {
                b++;
                move++;
            }
            if (a / b > 64)
            while(a > 0) {
                a = a / b;
                System.out.println(a);
                move++;
            }
            out.println(move);
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
