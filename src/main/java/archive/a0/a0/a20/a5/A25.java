package archive.a0.a0.a20.a5;


import java.io.*;
import java.util.StringTokenizer;

// IQ тест
public class A25 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
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
        try {
            in = new FastScanner(new InputStreamReader(System.in));
            out = new PrintWriter(new OutputStreamWriter(System.out));
            //in = new FastScanner(new File(".in"));
            //out = new PrintWriter(new File(".out"));

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

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
        new A25().run();
    }
}
