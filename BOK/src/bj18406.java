import java.util.*;
public class bj18406{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int jari = 0; int tem = N;
        int suml=0, sumr = 0;
        while(1<2){
            if(tem == 0 )
                break;
            tem /= 10;
            jari++;
        }
        int[] arr = new int[jari];
        for(int a=0; a<jari; a++){
            arr[a] = N%10;
            N /=10;
        }
        for(int a=0; a<jari/2; a++){
            suml += arr[a];
            sumr += arr[a+jari/2];
        }
        System.out.println(suml+" "+sumr);
        if(suml == sumr)
            System.out.println("LUCKY");
        else
            System.out.println("READY");
        
    }
}