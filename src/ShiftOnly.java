import java.io.IOException;
import java.util.Scanner;

public class ShiftOnly {
    public static void main(String[] args) throws IOException {
        //2020/08/24 14:58~15:18
        //黒板にN個の正の整数A1,...,ANが書かれています。
        //すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．
        //黒板に書かれている整数すべてを，2で割ったものに置き換える．
        //すぬけ君は最大で何回操作を行うことができるかを求めてください．

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new  int[n];
        for (int i = 0; i< a.length;i++){
            a[i]= sc.nextInt();
        }


        int loop = 0;
        out:
        while (true){
            for(int j = 0; j<a.length; j++){
                if(a[j]%2!=0){
                    break out;
                }
                else {
                    a[j]=a[j]/2;
                }
            }
            loop++;
        }
        System.out.println(loop);




    }
}
