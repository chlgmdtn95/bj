import java.util.*;
import java.io.*;

public class bj19336541{
    static int power(int a, int b){
    	int d =a;
        for(int c=1; c<b; c++)
            a*=d;
        return a;
    }
    public static void main(String[] args) throws IOException{
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int casenum = sc.nextInt();
        int digit; int c;
        
        int[] two = new int[5]; int[] three = new int[5]; int[] four = new int[3];
        int[] seven = new int[5]; int[] eight = new int[5]; int[] nine = new int[3];
            for(int a=1; a<=4; a++){
                two[a]= power(2,a)%10;
                three[a] = power(3,a)%10;
                seven[a] = power(7,a)%10;
                eight[a] = power(8,a)%10;
            }
        two[0]=two[4]; three[0]=three[4]; seven[0]=seven[4]; eight[0]=eight[4];
        four[0]=6; four[1]=4; four[2]=6; nine[0]=1; nine[1]=9; nine[2]=1;
        
        for(int f=0; f<casenum; f++){
            digit = sc.nextInt(); c = sc.nextInt();
            digit = digit%10;
                        
            switch(digit){
                case 1:
                    bw.write(String.valueOf(1)+"\n");
                    break;
                case 2:
                    bw.write(String.valueOf(two[c%4])+"\n");
                    break;
                case 3:
                	bw.write(String.valueOf(three[c%4])+"\n");
                    break;
                case 4:
                	bw.write(String.valueOf(four[c%2])+"\n");
                    break;
                case 5:
                	bw.write(String.valueOf(5)+"\n");
                    break;
                case 6:
                	bw.write(String.valueOf(6)+"\n");
                    break;
                case 7:
                	bw.write(String.valueOf(seven[c%4])+"\n");
                    break;
                case 8:
                	bw.write(String.valueOf(eight[c%4])+"\n");
                    break;
                case 9:
                	bw.write(String.valueOf(nine[c%2])+"\n");
                    break;
                case 0:
                	bw.write(String.valueOf(0)+"\n");
                    break;
            }            
        }
        bw.flush();
        bw.close();
    }
}