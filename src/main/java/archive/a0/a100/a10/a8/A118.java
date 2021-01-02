package archive.a0.a100.a10.a8;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// Упражнение на строки
public class A118 {
    FastScanner in;
    PrintWriter out;


    public void solve() throws IOException {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'o', 'y', 'e', 'u', 'i'));
        String str = in.next().toLowerCase();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(str.charAt(i))) {
                res = res + "." + str.charAt(i);
            }
        }
        out.println(res);
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
        new A118().run();
    }
}
