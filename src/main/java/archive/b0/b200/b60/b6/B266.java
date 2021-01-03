package archive.b0.b200.b60.b6;


import java.io.*;
import java.util.StringTokenizer;

// Очередь в школе
public class B266 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();
        String str = in.next();
        char[] chars = str.toCharArray();
        if (n < 2) {
            out.println(str);
            return;
        }
        for (int i = 0; i < k; i++) {
            char[] steps = new char[n];
            for (int j = 0; j < n; j++) {
                if (chars[j] == 'G') {
                    steps[j] = 'G';
                } else {
                    if (j < n - 1 && chars[j + 1] == 'G') {
                        steps[j] = 'G';
                        steps[j + 1] = 'B';
                        j++;
                    } else {
                        steps[j] = 'B';
                    }
                }
            }
            chars = steps;
        }
        for (int i = 0; i < n; i++) {
            out.print(chars[i]);
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
        new B266().run();
    }
}
