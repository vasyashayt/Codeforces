package contest.c1400_1499.c1474.codeforces_round_696_div2;


import java.io.*;
import java.util.StringTokenizer;

public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String str = in.next();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                int num = str.charAt(i) - '0';
                a[i] = num;
                if (i == 0) {
                    b[i] = 1;
                } else {
                    int prev = a[i - 1] + b[i - 1];
                    if (num + 1 != prev) {
                        b[i] = 1;
                    } else {
                        b[i] = 0;
                    }
                }
                out.print(b[i]);

            }
            out.println();
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
