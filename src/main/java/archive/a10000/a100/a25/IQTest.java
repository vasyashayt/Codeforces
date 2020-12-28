package archive.a10000.a100.a25;


import java.io.*;
import java.util.StringTokenizer;

public class IQTest {
    FastScanner in;
    PrintWriter out;


    public void solve() {
        int n = in.nextInt();
        int odd = 0;
        int oddNum = 0;
        int evenNum = 0;
        for (int i = 0; i < n; i++) {
            if (in.nextInt() % 2 == 0) {
                evenNum = i;
            } else {
                odd++;
                oddNum = i;
            }
        }
        if (odd == 1) {
            out.println(oddNum + 1);
        } else {
            out.println(evenNum + 1);
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
        new IQTest().run();
    }
}

