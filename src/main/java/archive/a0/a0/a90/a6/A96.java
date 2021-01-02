package archive.a0.a0.a90.a6;


import java.io.*;
import java.util.StringTokenizer;

// Футбол
public class A96 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
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
        new A96().run();
    }
}
