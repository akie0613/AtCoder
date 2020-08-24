import java.io.IOException;
import java.util.Scanner;

public class Product {
    //2020/08/24 14:20~14:27
    //課題：二つの正整数aとbの積が偶数か奇数か判定してください。
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a*b)%2==0){
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }

    }

}
