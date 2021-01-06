package archive.a0.a100.a10.a0;


import java.io.*;
import java.util.StringTokenizer;

// Почти счастливое число
public class A110 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        String str = in.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '4' || c == '7') {
                count++;
            }
        }
        boolean flag = true;
        String w = String.valueOf(count);
        for (int i = 0; i < w.length(); i++) {
            if (!(w.charAt(i) == '4' || w.charAt(i) == '7')) {
                flag = false;
                break;
            }
        }
        if (flag) {
            out.println("YES");
        } else {
            out.println("NO");
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
        new A110().run();
    }
}
