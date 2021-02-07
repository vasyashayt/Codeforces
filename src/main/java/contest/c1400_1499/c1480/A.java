package contest.c1400_1499.c1480;


import java.io.*;
import java.util.StringTokenizer;

// Еще одна игра со строкой
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while(t-- > 0) {
            String str = in.next();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (i % 2 == 0) {
                    if (c == 'a') {
                        res.append('b');
                    } else {
                        res.append('a');
                    }
                } else {
                    if (c == 'z') {
                        res.append('y');
                    } else {
                        res.append('z');
                    }
                }
            }
            out.println(res.toString());
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
