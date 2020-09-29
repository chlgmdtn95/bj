import java.util.*;
import java.io.*;

public class bj4948 {
	public static void main(String[] args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[300001];
		arr[0]=1; arr[1] =1;
		for(int a=2; a<600; a++) {
			if(arr[a]==0)
				for(int b=2; b<150000; b++) {
					if(a*b>300000)
						break;
					arr[a*b] =1;
				}
		}
		
		int numofprime =0;
		int number =50; 
		while (number !=0){
			numofprime =0;
			number = Integer.parseInt(br.readLine());
			if(number ==0)
				break;
			for(int a= number+1; a<=number*2; a++) {
				if(arr[a] == 0)
					numofprime++;
			}
			bw.write(String.valueOf(numofprime)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
