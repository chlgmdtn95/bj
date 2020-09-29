import java.util.*;
public class bj2420{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        
        if(b1-b2<0)
            System.out.println(b2-b1);
        else
            System.out.println(b1-b2);
        
    }
}
