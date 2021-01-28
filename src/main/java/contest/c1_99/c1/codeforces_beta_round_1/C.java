package contest.c1_99.c1.codeforces_beta_round_1;


import java.io.*;
import java.util.StringTokenizer;

public class C {
    FastScanner in;
    PrintWriter out;

    public void solve() {
        final double aX = in.nextDouble();
        final double aY = in.nextDouble();
        final double bX = in.nextDouble();
        final double bY = in.nextDouble();
        final double cX = in.nextDouble();
        final double cY = in.nextDouble();

        double a = Math.sqrt((bX - aX) * (bX - aX) + (bY - aY) * (bY - aY));
        double b = Math.sqrt((bX - cX) * (bX - cX) + (bY - cY) * (bY - cY));
        double c = Math.sqrt((cX - aX) * (cX - aX) + (cY - aY) * (cY - aY));

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        double r = (a * b * c) / (4 * s);

        double alpha = Math.acos((a * a + b * b - c * c) / (2 * a * b));

        double beta = Math.acos((a * a + c * c - b * b) / (2 * a * c));

        double gamma = Math.PI - alpha - beta;

        long n = Math.round(Math.PI / gcd(beta, gcd(alpha, gamma)));

        out.println(r * r * Math.sin(2 * Math.PI / n) * n / 2);
    }

    private static double gcd(double a, double b) {

        if (a < b) return gcd(a, b);

        if (Math.abs(b) < 0.001) {

            return a;

        } else {

            return (gcd(b, a - Math.floor(a / b) * b));

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
        new C().run();
    }
}
