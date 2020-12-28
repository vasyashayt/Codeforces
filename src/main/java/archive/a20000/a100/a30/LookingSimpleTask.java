package archive.a20000.a100.a30;


import java.io.*;
import java.util.StringTokenizer;

public class LookingSimpleTask {
    FastScanner in;
    PrintWriter out;


    public void solve() {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (in.nextInt() == 1) {
                out.println("HARD");
                return;
            }
        }
        out.println("EASY");
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
        new LookingSimpleTask().run();
    }
}
