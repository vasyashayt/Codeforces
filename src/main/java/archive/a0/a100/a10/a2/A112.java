package archive.a0.a100.a10.a2;


import java.io.*;
import java.util.StringTokenizer;

// Петя и строки
public class A112 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        String str1 = in.next().toLowerCase();
        String str2 = in.next().toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) > str2.charAt(i)) {
                out.println(1);
                return;
            } else if(str1.charAt(i) < str2.charAt(i)) {
                out.println(-1);
                return;
            }
        }
        out.println(0);
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
        new A112().run();
    }
}
