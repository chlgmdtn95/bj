import java.util.*;
import java.io.*;

public class bj11053 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		int memo[] = new int[N];
		
		for(int a=0; a<N; a++)
			memo[a] = 1;
		
		for(int a=0; a<N; a++) 
			arr[a] = Integer.parseInt(st.nextToken());
		
		for(int a=0; a<N; a++)
			for(int b=0; b<a; b++) 
				if(arr[b] < arr[a]) 
					memo[a] = Math.max(memo[a] , memo[b]+1);		
		
		Arrays.sort(memo);
		System.out.println(memo[N-1]);
	}
}
