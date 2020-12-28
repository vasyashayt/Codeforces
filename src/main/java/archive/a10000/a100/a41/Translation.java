package archive.a10000.a100.a41;


import java.io.*;
import java.util.StringTokenizer;

public class Translation {
    FastScanner in;
    PrintWriter out;


    public void solve() {
        String str = in.next();
        String revStr = in.next();
        if (str.length() != revStr.length()) {
            out.println("NO");
            return;
        }
        int size = str.length();
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != revStr.charAt(size - 1 - i)) {
                out.println("NO");
                return;
            }
        }
        out.println("YES");
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
        new Translation().run();
    }
}

