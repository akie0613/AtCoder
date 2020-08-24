import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WelcomeToAtCoder {
    //2020/08/24 14:29~14:49
    //問題文：すぬけ君は 1,2,3の番号がついた 3つのマスからなるマス目を持っています。 各マスには 0 か 1 が書かれており、マスiには siが書かれています。
    //すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int numOne = 0;

        for(int i = 0; i<a.length();i++){
            char test = a.charAt(i);
            if(a.charAt(i)=='1'){
                numOne++;
            }
        }
        System.out.println(numOne);
    }
}
