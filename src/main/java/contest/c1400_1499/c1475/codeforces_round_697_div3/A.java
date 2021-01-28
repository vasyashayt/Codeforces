package contest.c1400_1499.c1475.codeforces_round_697_div3;


import java.io.*;
import java.util.StringTokenizer;

public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();

        while (t-- > 0) {
            long n = in.nextLong();
            boolean flag = false;
            if (n % 2 != 0) {
                flag = true;
            } else {
                while (n % 2 == 0) {
                    n /= 2;
                }
                if (n > 2) {
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
        new A().run();
    }
}
