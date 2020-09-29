import java.util.*;
import java.io.*;

public class bj13304 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); int k = Integer.parseInt(st.nextToken());
		int jeo=0; int jungW=0; int jungM=0; int goW=0; int goM=0;
		int sex; int grade; int numberOfRoom=0;
		
		for(int a=0; a<N; a++) {
			st = new StringTokenizer(br.readLine());
			sex = Integer.parseInt(st.nextToken()); grade = Integer.parseInt(st.nextToken());
			
			if(grade<3) jeo++;
			else if(grade<5 & sex==0) jungW++;
			else if(grade<5 & sex==1) jungM++;
			else if(sex==0) goW++;
			else goM++;
			
			numberOfRoom = jeo/k+jungW/k+jungM/k+goW/k+goM/k;
			
			if(jeo%k!=0)numberOfRoom++;
			if(jungW%k!=0)numberOfRoom++;
			if(jungM%k!=0)numberOfRoom++;
			if(goW%k!=0)numberOfRoom++;
			if(goM%k!=0)numberOfRoom++;						
		}
		System.out.println(numberOfRoom);
	}
}
