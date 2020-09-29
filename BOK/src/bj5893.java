import java.util.*;
public class bj5893{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ori = sc.nextLine();
        String te = ori+"0000";
        int[] arr = new int[te.length()];
        for(int a=0; a<te.length(); a++){
            if(a<4)
                arr[a] = te.charAt(a) -'0';
            else{
               arr[a] = (te.charAt(a) -'0') + (ori.charAt(a-4) - '0');
            }
        }
        for(int a = arr.length-1 ; a>0; a--){
            if(arr[a] == 2){
                arr[a-1] ++;
                arr[a] = 0;
            }
            if(arr[a] == 3){
                arr[a-1] ++;
                arr[a] = 1;
            }
        }
        if(arr[0] == 2){
            System.out.print("10");
            for(int a=1; a<arr.length; a++)
                System.out.print(arr[a]);
        }
        else {
            for(int a=0; a<arr.length; a++)
                System.out.print(arr[a]);            
        }
    }
}