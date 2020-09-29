import java.util.*;
import java.io.*;

public class bj14002 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[N];
		int memo[] = new int[N];
		int arr2[] = new int[N];
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int a=0; a<N; a++)
			arr[a] = Integer.parseInt(st.nextToken());
		
		for(int a=0; a<N; a++)
			memo[a] = 1;
		
		for(int a=0; a<N; a++)
			for(int b=0; b<a; b++) {
				if(arr[b] < arr[a]) {
					if(memo[b]+1 > memo[a]) {
						memo[a] = memo[b] + 1;
						arr2[a] = b;
					}
				}
			}
		
		int max = memo[0];
		int maxindex = 0;
		for(int a=0; a<N; a++) {
			if(memo[a] > max) {
				max = memo[a];
				maxindex = a;
			}
		}
		System.out.println(memo[maxindex]);
		int tem = maxindex;
		
		for(int a=0; a<memo[maxindex]; a++) {
			al.add(arr[tem]);
			tem = arr2[tem];			
		}
		
		for(int a = al.size()-1 ; a>=0; a--)
			sb.append(al.get(a)+" ");
		
		System.out.println(sb);
	}
}
