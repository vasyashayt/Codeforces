package archive.a10000.a100.a69;

import java.io.*;
import java.util.StringTokenizer;

public class YoungPhysicist {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            a += in.nextInt();
            b += in.nextInt();
            c += in.nextInt();
        }
        if (a == 0 && b == 0 && c == 0) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }

    public void run() {
        in = new FastScanner(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));

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

    }

    public static void main(String[] args) {
        new YoungPhysicist().run();
    }
}
