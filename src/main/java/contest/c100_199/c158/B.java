package contest.c100_199.c158;


import java.io.*;
import java.util.StringTokenizer;

// Такси
public class B {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int car = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            switch (k) {
                case 4:
                    car++;
                    break;
                case 3:
                    if (one > 0) {
                        one--;
                        car++;
                    } else {
                        three++;
                    }
                    break;
                case 2:
                    if (two > 0) {
                        two--;
                        car++;
                    } else {
                        two++;
                    }
                    break;
                case 1:
                    if (three > 0) {
                        three--;
                        car++;
                    } else {
                        one++;
                    }
                    break;
                default: break;
            }
        }
        car += three;
        if (two > 0) {
            one--;
            one--;
            car++;
        }
        while(one > 0) {
            one -= 4;
            car ++;
        }
        out.println(car);
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
