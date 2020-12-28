package archive.a1000.a100.a58;

import java.io.*;
import java.util.StringTokenizer;

public class Chat {
    FastScanner in;
    PrintWriter out;


    public void solve() {
        String str = in.next();
        int w = 0;
        for (int i = 0; i < str.length(); i++) {
            if (w == 0 && str.charAt(i) == 'h') {
                w++;
                continue;
            }
            if (w == 1 && str.charAt(i) == 'e') {
                w++;
                continue;
            }
            if (w == 2 && str.charAt(i) == 'l') {
                w++;
                continue;
            }
            if (w == 3 && str.charAt(i) == 'l') {
                w++;
                continue;
            }
            if (w == 4 && str.charAt(i) == 'o') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
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
        new Chat().run();
    }
}
