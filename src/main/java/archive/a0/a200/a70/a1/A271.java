package archive.a0.a200.a70.a1;


import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// Красивый год
public class A271 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int year = in.nextInt();
        int modYear = year + 1;
        int nextYear = year + 1;
        Set<Integer> chars = new HashSet<>();
        while (true) {
            for (int i = 0; i < 4; i++) {
                chars.add(nextYear % 10);
                nextYear /= 10;
            }
            if (chars.size() == 4) {
                out.println(modYear);
                break;
            } else {
                modYear++;
                nextYear = modYear;
                chars.clear();
            }
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
        new A271().run();
    }
}
