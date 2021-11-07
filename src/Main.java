import java.io.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] Num = new int[3];
        for(int i = 0; i < 3; i++){
            Num[i] = Integer.parseInt(bf.readLine());
        }

        int Mul = Num[0] * Num[1] * Num[2];

        int[] Digit = new int[10];

        for(int j = 0; j < 10; j++){
            Digit[j] = (int) ((Mul % Math.pow(10,j+1)) / Math.pow(10,j));
        }
        int[] count = new int[10];
        for(int k = 9; k >= 0; k--){
            if(Digit[k] != 0){
                for(; k>=0; k--){
                    for(int l=0; l<10; l++){
                        if(Digit[k] == l){
                            count[l]++;
                            break;
                        }
                    }
                }
                break;
            }
        }
        StringBuilder result= new StringBuilder();
        for(int i = 0; i < 10; i++){
            result.append(count[i]);
            if(i != 9){
                result.append("\n");
            }
        }
        bw.write(result.toString());
        bw.flush();
        bw.close();
        bf.close();
    }
}