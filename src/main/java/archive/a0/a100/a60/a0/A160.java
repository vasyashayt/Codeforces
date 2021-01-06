package archive.a0.a100.a60.a0;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// Близнецы
public class A160 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int n = in.nextInt();
        int[] coins = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int coin = in.nextInt();
            coins[i] = coin;
            sum += coin;
        }
        Arrays.sort(coins);
        int countBrother = 0;
        int sumBrother = 0;
        for (int i = n - 1; i >= 0; i--) {
            countBrother++;
            sumBrother += coins[i];
            if (sumBrother * 2 > sum) {
                break;
            }
        }
        out.println(countBrother);
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
        new A160().run();
    }
}
