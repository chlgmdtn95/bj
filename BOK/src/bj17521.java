import java.util.*;
import java.io.*;

public class bj17521{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long numberofcoin, money; 
        int n = Integer.parseInt(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long increase;
        long arr[] = new long[n];
        for(int a=0; a<n; a++)
            arr[a] = Long.parseLong(br.readLine());
        increase = arr[1] - arr[0];
        if(increase > 0){
            numberofcoin = w/arr[0];
            money = w%arr[0];
        }
        else{
            numberofcoin = 0;
            money = w;
        }        
        for(int a=1; a<n-1; a++){
        	if(increase == 0 & arr[a]!=arr[a+1]) {
        		increase = arr[a+1] - arr[a];
                if(increase > 0){
                    numberofcoin = w/arr[0];
                    money = w%arr[0];
                }
                else{
                    numberofcoin = 0;
                    money = w;
                }        
        		continue;
        	}
        	if(arr[a+1] == arr[a])
        		continue;
        	if(increase == 0)
        		continue;
            if(arr[a+1]-arr[a] > 0 & increase < 0){
                numberofcoin = money/arr[a];
                money = money%arr[a];
            }
            if(arr[a+1]-arr[a] < 0 & increase > 0){
                money = money+arr[a]*numberofcoin;
                numberofcoin = 0;
            }
            increase = arr[a+1]-arr[a];
        }
        System.out.println(money+numberofcoin*arr[n-1]);
    }
}