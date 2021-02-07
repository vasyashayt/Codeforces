package contest.c1400_1499.c1480;


import java.io.*;
import java.util.StringTokenizer;

// Великий герой
public class B {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        int t = in.nextInt();
        while(t-- > 0) {
            int aPower = in.nextInt(); //сила
            int bHealth = in.nextInt(); //здоровье
            int n = in.nextInt(); //количество монстров
            int[] powers = new int[n];
            int[] healths = new int[n];
            int maxPower = 0;
            int maxPowerI = 0;
            int maxHealth = 0;
            int maxHealthI = 0;
            for (int i = 0; i < n; i++) {
                int p = in.nextInt();
                if (p >= maxPower) {
                    maxPower = p;
                    maxPowerI = i;
                }
                powers[i] = p;
            }
            for (int i = 0; i < n; i++) {
                int h = in.nextInt();
                if (h >= maxHealth) {
                    maxHealth = h;
                    maxHealthI = i;
                }
                healths[i] = h;
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (i == maxPowerI) continue;
                int p = powers[i];
                int h = healths[i];
                while(h > 0 && bHealth > 0) {
                    h -= aPower;
                    bHealth -= p;
                }
//                if (aPower < h) {
//                    while(h > 0 && bHealth > 0) {
//                        h -= aPower;
//                        bHealth -= p;
//                    }
//                } else {
//                    bHealth -= p;
//                }
                if (bHealth < 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int p = powers[maxPowerI];
                int h = healths[maxPowerI];
                while(h > 0 && bHealth > 0) {
                    h -= aPower;
                    bHealth -= p;
                }
                if (h < 1) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            } else {
                out.println("NO");
            }
//            1
//            3 17 1
//            2
//            16
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
