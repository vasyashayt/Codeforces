package archive.a10000.a100.a50;


import java.io.*;
import java.util.StringTokenizer;

public class DominosLaying {
    FastScanner in;
    PrintWriter out;


    public void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        out.println(m * n / 2);
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
        new DominosLaying().run();
    }
}
