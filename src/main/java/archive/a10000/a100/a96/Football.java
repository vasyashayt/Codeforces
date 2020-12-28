package archive.a10000.a100.a96;

import java.io.*;
import java.util.StringTokenizer;

public class Football {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        String str = in.next();
        int zero = 0;
        int one = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zero++;
                one = 0;
            }
            if (str.charAt(i) == '1') {
                one++;
                zero = 0;
            }
            if (zero == 7 || one == 7) {
                out.println("YES");
                return;
            }
        }
        out.println("NO");
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
        new Football().run();
    }

}
