import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length(); ++i) {
            System.out.print(str.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        br.close();
    }
}