package contest.c1400_1499.c1481;


import java.io.*;
import java.util.StringTokenizer;

// Новая колония
public class B {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] mountains = new int[n];
            for (int i = 0; i < n; i++) {
                mountains[i] = in.nextInt();
            }
            int res = -2;
            while (k > 0) {
                boolean flag = false;
                for (int i = 0; i < n - 1; i++) {
                    res = -2;
                    if (mountains[i] < mountains[i + 1]) {
                        int diff = mountains[i + 1] - mountains[i];
                        mountains[i] += diff;
                        res = i;
                        k -= diff;
                        flag = true;
                    }
                    if (k <= 0) break;
                }
                if (!flag) k--;
            }
            out.println(++res);



//            while (k-- > 0) {
//                for (int i = 0; i < n - 1; i++) {
//                    res = -2;
//                    if (mountains[i] >= mountains[i + 1]) {
//                        continue;
//                    } else {
//                        mountains[i]++;
//                        res = i;
//                        break;
//                    }
//                }
//            }
//            out.println(++res);

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
        new B().run();
    }
}
