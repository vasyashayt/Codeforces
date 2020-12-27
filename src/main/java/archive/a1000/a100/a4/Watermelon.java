package archive.a1000.a100.a4;


import java.io.*;
import java.util.StringTokenizer;

public class Watermelon {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int w = in.nextInt();
        if (w < 4 || w % 2 != 0) out.println("NO");
        else out.println("YES");
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

    public static void main(String[] arg) {
        new Watermelon().run();
    }
}
