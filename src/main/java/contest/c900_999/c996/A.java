package contest.c900_999.c996;


import java.io.*;
import java.util.StringTokenizer;

// Выиграть в лотерею
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int count = 0;
        while (n >= 100) {
            n -= 100;
            count++;
        }
        while (n >= 20) {
            n -= 20;
            count++;
        }
        while (n >= 10) {
            n -= 10;
            count++;
        }
        while (n >= 5) {
            n -= 5;
            count++;
        }
        while (n >= 1) {
            n -= 1;
            count++;
        }
        out.println(count);
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
