package contest.c700_799.c705;


import java.io.*;
import java.util.StringTokenizer;

// Халк
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        String hate = "I hate ";
        String love = "I love ";
        StringBuilder builder = new StringBuilder();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                builder.append(hate);
            } else {
                builder.append(love);
            }
            if (i + 1 == n) {
                builder.append("it");
            } else {
                builder.append("that ");
            }
        }
        out.println(builder.toString());
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
