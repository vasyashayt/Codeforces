package educational_codeforces_round_102;

import java.io.*;
import java.util.StringTokenizer;

public class B {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int t = in.nextInt();
        while(t-- > 0) {
            String str1 = in.next();
            String str2 = in.next();
            int gcd = gcd(str1.length(), str2.length());
            int nok = str1.length() * str2.length() / gcd;
            String str1Multi = multiStr(str1, nok / str1.length());
            String str2Multi = multiStr(str2, nok / str2.length());
            if (str1Multi.equals(str2Multi)) {
                out.println(str1Multi);
            } else {
                out.println(-1);
            }
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public String multiStr(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(str);
        }
        return res.toString();
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
        new B().run();
    }
}
