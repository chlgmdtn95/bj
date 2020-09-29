import java.util.*;

public class bj16430{
    static int gcd(int a, int b){
        int r;
        while(b!=0){
            r =a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt(); int m = sc.nextInt();
        int gc = gcd(j, m);
        System.out.println(gc);

        System.out.print((m-j)/gc);
        System.out.print(" ");
        System.out.print(j/gc);
    }
}