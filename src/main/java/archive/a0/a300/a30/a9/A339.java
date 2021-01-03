package archive.a0.a300.a30.a9;


import java.io.*;
import java.util.StringTokenizer;

// Математика спешит на помощь
public class A339 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        String str = in.next();
        if (str.contains("+")) {
            String[] numbers = str.split("\\+");
            int[] counts = new int[3];
            for (int i = 0; i < numbers.length; i++) {
                counts[Integer.parseInt(numbers[i]) - 1]++;
            }
            StringBuilder res = new StringBuilder("");
            boolean flag = false;
            for (int i = 0; i < counts.length; i++) {
                for (int j = 0; j < counts[i]; j++) {
                    if (flag) res.append("+");
                    res.append(i + 1);
                    flag = true;
                }
            }
            out.println(res.toString());
        } else {
            out.println(str);
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
        new A339().run();
    }
}
