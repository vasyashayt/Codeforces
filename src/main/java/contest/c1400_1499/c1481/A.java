package contest.c1400_1499.c1481;


import java.io.*;
import java.util.StringTokenizer;

// Космическая навигация
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while(t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int pxPlus = 0;
            int pxMinus = 0;
            int pyPlus = 0;
            int pyMinus = 0;
            String str = in.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'U') {
                    pyPlus++;
                }
                if (str.charAt(i) == 'D') {
                    pyMinus--;
                }
                if (str.charAt(i) == 'R') {
                    pxPlus++;
                }
                if (str.charAt(i) == 'L') {
                    pxMinus--;
                }
            }
            if (pxMinus <= x && x <= pxPlus && pyMinus <= y && y <= pyPlus) {
                out.println("YES");
            } else {
                out.println("NO");
            }
//                out.println("YES");
//            } else {
//                out.println("NO");
//            }
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
