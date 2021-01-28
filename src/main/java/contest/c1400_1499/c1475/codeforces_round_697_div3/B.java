package contest.c1400_1499.c1475.codeforces_round_697_div3;


import java.io.*;
import java.util.StringTokenizer;

public class B {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        int p = 2020;

        while (t-- > 0) {
            int n = in.nextInt();
            boolean flag = false;

            if (n >= p) {
                int sum = 0;
                int count = 0;
                while ((sum + p) <= n) {
                    sum += p;
                    count++;
                }
                if (sum == n || (sum + count >= n)) {
                    flag = true;
                }
            }

            if (flag) {
                out.println("YES");
            } else {
                out.println("NO");
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
        new B().run();
    }
}
