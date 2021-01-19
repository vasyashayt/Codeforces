package archive.b0.b0.b0.b1;


import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//+ Электронные таблицы
public class B1 {
    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str = in.next();
            Pattern pattern = Pattern.compile("R.*[0-9]C.*[0-9]");
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                String row = str.substring(1, str.indexOf("C"));
                String cell = str.substring(str.indexOf("C") + 1);
                out.println(intToStr(Integer.parseInt(cell)) + row);
            } else {
                String cell = "";
                String row = "";
                for (int j = 0; j < str.length(); j++) {
                    if (!Character.isDigit(str.charAt(j))) {
                        cell += str.charAt(j);
                    } else {
                        row += str.charAt(j);
                    }
                }
                out.println("R" + row + "C" + strToInt(cell));
            }
        }
    }

    public String intToStr(int k) {
        String str = "";
        while (k > 0) {
            k--;
            int letter = k % 26;
            str = (char)('A' + letter) + str;
            k /= 26;
        }
        return str;
    }

    public int strToInt(String str) {
        int k = 0;
        int pow = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int num = str.charAt(i) - 'A' + 1;
            k = k + num * (int)Math.pow(26, pow);
            pow++;
        }
        return k;
    }

    public void run() {
        try {
            in = new FastScanner(new InputStreamReader(System.in));
            out = new PrintWriter(new BufferedOutputStream(System.out));
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
        new B1().run();
    }
}
