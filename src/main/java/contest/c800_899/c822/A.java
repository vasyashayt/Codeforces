package contest.c800_899.c822;


import java.io.*;
import java.util.StringTokenizer;

// Мне скучно жить
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int min = Math.min(a, b);
        int power = 1;
        for (int i = 1; i <= min; i++) {
            power *= i;
        }
        out.println(power);
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
