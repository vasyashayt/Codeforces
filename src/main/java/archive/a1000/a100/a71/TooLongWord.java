package archive.a1000.a100.a71;


import java.io.*;
import java.util.StringTokenizer;

public class TooLongWord {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String word = in.next();
            if (word.length() <= 10) {
                out.println(word);
            } else {
                String wordMod = "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
                out.println(wordMod);
            }
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
        new TooLongWord().run();
    }
}
