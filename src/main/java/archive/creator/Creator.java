package archive.creator;

import java.io.*;

public class Creator {
    public static void main(String[] args) throws IOException {
        String code = "import java.io.*;\n" +
                "import java.util.StringTokenizer;\n" +
                "\n" +
                "public class ItmoTemplate {\n" +
                "    FastScanner in;\n" +
                "    PrintWriter out;\n" +
                "\n" +
                "    public void solve() throws IOException {\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    public void run() {\n" +
                "        try {\n" +
                "            in = new FastScanner(new InputStreamReader(System.in));\n" +
                "            out = new PrintWriter(new OutputStreamWriter(System.out));\n" +
                "            //in = new FastScanner(new File(\".in\"));\n" +
                "            //out = new PrintWriter(new File(\".out\"));\n" +
                "\n" +
                "            solve();\n" +
                "\n" +
                "            out.close();\n" +
                "        } catch (IOException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    class FastScanner {\n" +
                "        BufferedReader br;\n" +
                "        StringTokenizer st;\n" +
                "\n" +
                "        FastScanner(File f) {\n" +
                "            try {\n" +
                "                br = new BufferedReader(new FileReader(f));\n" +
                "            } catch (FileNotFoundException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        FastScanner(InputStreamReader f) {\n" +
                "            br = new BufferedReader(f);\n" +
                "        }\n" +
                "\n" +
                "        String next() {\n" +
                "            while (st == null || !st.hasMoreTokens()) {\n" +
                "                try {\n" +
                "                    st = new StringTokenizer(br.readLine());\n" +
                "                } catch (IOException e) {\n" +
                "                    e.printStackTrace();\n" +
                "                }\n" +
                "            }\n" +
                "            return st.nextToken();\n" +
                "        }\n" +
                "\n" +
                "        int nextInt() {\n" +
                "            return Integer.parseInt(next());\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String[] arg) {\n" +
                "        new ItmoTemplate().run();\n" +
                "    }\n" +
                "}\n";

        int num = 1000;
        String packageName = "f";
        String fileName = "F";

        String path = "src/main/java/archive/" + packageName + num;
        String packageDefault = "package archive." + packageName + num;


        for (int i = 0; i < 10; i++) {
            File file100Path = new File(path, packageName + i * 100);
            file100Path.mkdirs();
            for (int j = 0; j < 10; j++) {
                File file10Path = new File(file100Path.getPath(), packageName + j * 10);
                System.out.println(file10Path.getPath());
                file10Path.mkdirs();

                for (int k = 0; k < 10; k++) {
                    File file1Path = new File(file10Path.getPath(), packageName + k);
                    System.out.println(file1Path.getPath());
                    file1Path.mkdirs();
                    String name = fileName + num;
                    num++;
                    File file = new File(file1Path, name + ".java");
                    System.out.println(file.getPath());
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));

                    writer.write(packageDefault + "." + (packageName + i * 100) + "." +  (packageName + j * 10) + "." + (packageName + k) + ";" +"\n\n\n" + code.replaceAll("ItmoTemplate", name));
                    writer.close();
                }

            }

        }



    }
}
