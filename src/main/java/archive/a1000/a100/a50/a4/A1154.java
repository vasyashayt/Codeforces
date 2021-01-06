package archive.a1000.a100.a50.a4;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1154 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int [] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        out.println(nums[3] - nums[0]);
        out.println(nums[3] - nums[1]);
        out.println(nums[3] - nums[2]);
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
        new A1154().run();
    }
}
