package contest.c1000_c1099.c1097;


import java.io.*;
import java.util.StringTokenizer;

// Геннадий и карточная игра
public class A {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        String tCard = in.next();
        char d = tCard.charAt(0);
        char m = tCard.charAt(1);
        for (int i = 0; i < 5; i++) {
            String card = in.next();
            if (card.charAt(0) == d || card.charAt(1) == m) {
                out.println("YES");
                return;
            }
        }
        out.println("NO");

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
