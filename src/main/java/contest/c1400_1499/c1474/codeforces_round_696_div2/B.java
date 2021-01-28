package contest.c1400_1499.c1474.codeforces_round_696_div2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while (t-- > 0) {
            int d = in.nextInt();

            int num = 6;

            while (true) {
                int dels = 2;
                int last = 1;
                boolean flag = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        if (Math.abs(i - last) >= d) {
                            last = i;
                            dels++;
                            //i += d - 1;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag && dels >= 4) {
                    out.println(num);
                    break;
                } else {
                    num++;
                    System.out.println(num);
                }
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
