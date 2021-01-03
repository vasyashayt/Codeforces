package archive.a0.a100.a10.a6;


import java.io.*;
import java.util.StringTokenizer;

// Трамвай
public class A116 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int min = 0;
        int pass = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            pass = pass - a + b;
            if (pass > min) {
                min = pass;
            }
        }
        out.println(min);
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
        new A116().run();
    }
}
