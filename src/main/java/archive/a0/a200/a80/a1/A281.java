package archive.a0.a200.a80.a1;


import java.io.*;
import java.util.StringTokenizer;

//Капитализация слова
public class A281 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        String str = in.next();
        if (str.length() > 1) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        } else {
            str = str.toUpperCase();
        }
        out.println(str);

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
        new A281().run();
    }
}
