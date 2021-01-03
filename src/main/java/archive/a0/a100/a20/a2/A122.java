package archive.a0.a100.a20.a2;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// Счастливое деление
public class A122 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int n = in.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int k = i;
            boolean happy = true;
            while (k > 0) {
                if (!(k % 10 == 4 || k % 10 == 7)) {
                    happy = false;
                    break;
                }
                k /= 10;
            }
            if (happy) {
                nums.add(i);
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (n % nums.get(i) == 0) {
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
        new A122().run();
    }
}
