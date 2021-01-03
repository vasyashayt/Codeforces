package archive.a0.a500.a40.a6;


import java.io.*;
import java.util.StringTokenizer;

// Солдат и бананы
public class A546 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += i * k;
        }
        int res = sum - n;
        if (res <= 0) {
            out.println(0);
        } else {
            out.println(res);
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
        new A546().run();
    }
}
