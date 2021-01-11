package codeforces_contest.round_693;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            int[] dp = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                dp[i] = a[i];
                int k = i + a[i];
                if (k < n) {
                    dp[i] += dp[k];
                }
            }
            out.println(Arrays.stream(dp).max().getAsInt());
//            int max = 0;
//            for (int j = 0; j < n; j++) {
//                int sum = 0;
//                int k = j;
//                while (k < n) {
//                    sum += arr[k];
//                    k = arr[k] + k;
//                }
//                if (sum > max) {
//                    max = sum;
//                }
//            }
//            out.println(max);
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
        // long start = System.nanoTime();
        new C().run();
        // System.out.println("Elapsed: " + (System.nanoTime() - start) / 1000000 +
        // "ns");

    }
}
