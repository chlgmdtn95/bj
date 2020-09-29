import java.util.*;
import java.io.*;

public class bj1978 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int casenumber = Integer.parseInt(br.readLine());
		int index=0;
		int numberofprime =0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] primenumber = new int[1001];
		for(int a=0; a<1001; a++)
			primenumber[a] = 0;
		primenumber[1] = 1;
		for(int a=2; a< 40; a++) {
			if(primenumber[a]==0) {
				for(int b=2; b<600 ; b++) {
					if(a*b>1000)
						break;
					primenumber[a*b] =1;
					
				}
			}
		}
		
		for(int a=0; a<casenumber; a++) {
			index = Integer.parseInt(st.nextToken());
			if(primenumber[index] ==0)
				numberofprime++;
				
		}
		
		bw.write(String.valueOf(numberofprime));
		bw.flush();
		bw.close();
	}
}