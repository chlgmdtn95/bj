import java.util.*;
public class bj2480{
     static int sn(int a, int b, int c){
         int sss =0;
         if(a==b) sss++;
         if(a==c) sss++;
         if(b==c) sss++;
         return sss;
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int[] af = new int[3];
         af[0]=sc.nextInt(); af[1]=sc.nextInt(); af[2]=sc.nextInt();
         Arrays.sort(af);
         int snn = sn(af[0],af[1],af[2]);
         
         if(snn ==3)
             System.out.println(10000+af[0]*1000);
         else if(snn==1){
             if(af[0]==af[1])
                 System.out.println(1000+af[0]*100);
             else if(af[1]==af[2])
                 System.out.println(1000+af[1]*100);
             else
                 System.out.println(1000+af[0]*100);
         }
         else
             System.out.println(af[2]*100);
     }
 }