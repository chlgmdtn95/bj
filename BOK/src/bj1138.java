import java.util.*;
import java.io.*;
public class bj1138 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for(int a=0; a<N; a++)
			arr[a] = 0;
		int count, number;
		st = new StringTokenizer(br.readLine());
		for(int a=0; a<N; a++) {
			number = Integer.parseInt(st.nextToken());
			count=0;
			for(int b=0; b<N; b++) {
				if(arr[b]==0 & number == count) {
					arr[b] = a+1;
					break;
				}
				if(arr[b]==0)
					count++;
			}
		}
		for(int a=0; a<N; a++)
			System.out.print(arr[a]+" ");
	}
}
