package contest.c400_c499.c469;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// I Wanna Be the Guy
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int[] a = new int[n];
        int p = in.nextInt();
        for (int i = 0; i < p; i++) {
            a[in.nextInt() - 1] = 1;
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            a[in.nextInt() - 1] = 1;
        }
        int sum = Arrays.stream(a).sum();
        if (sum == n) {
            out.println("I become the guy.");
        } else {
            out.println("Oh, my keyboard!");
        }
    }

    public void run() {
        in = new FastScanner(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;


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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

    public static void main(String[] arg) {
        new A().run();
    }
}
