package archive.a1000.a300.a231;

import java.io.*;
import java.util.StringTokenizer;

public class Team {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int taskSol = 0;
            for (int j = 0; j < 3; j++) {
                if (in.nextInt() == 1) taskSol++;
            }
            if (taskSol > 1) res++;
        }
        out.println(res);

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
        new Team().run();
    }
}
