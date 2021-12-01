import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            String[] str = br.readLine().split(",");
            bw.write(String.valueOf(Integer.parseInt(str[0]) + Integer.parseInt(str[1])));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}