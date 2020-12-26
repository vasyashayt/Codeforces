package archive.A1000.A100.A4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(reader.readLine());
        System.out.println(split(w));
    }

    public static String split(int w) {
        if (w < 4 || w % 2 != 0) return "NO";
        return "YES";
    }
}
