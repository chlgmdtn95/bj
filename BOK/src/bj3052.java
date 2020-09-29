import java.io.*;
import java.util.*;

public class bj3052 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num =0;
		boolean tf = false;
		int c=0;
		int[] arr = new int[10];
		for(int a=0; a<10; a++) {
			arr[a] =-1;
		}
		
		for(int b=0; b<10; b++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken());
			tf = false;
			
			for(int a=0; a<10; a++) {
				if(arr[a] == c%42) {
					tf = true;
					break;
				}
			}
			
			if(tf==false) {
				arr[num] = c%42;
				num++;
			}
		}
		
		bw.write(String.valueOf(num));
		
		bw.flush();
		bw.close();
	}

}
