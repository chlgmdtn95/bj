import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bj2667 {
	static int N;
	static int[][] arr;
	static ArrayList<Integer> al = new ArrayList<>();
	static int dfs(int a, int b) {
		int count = 1;
		arr[a][b] = 0;
		if(a<N-1)
			if(arr[a+1][b] == 1)
			count += dfs(a+1,b);
		if(b<N-1)
			if(arr[a][b+1] == 1)
			count+= dfs(a,b+1);
		if(a>0)
			if(arr[a-1][b] ==1)
				count += dfs(a-1,b);
		if(b>0)
			if(arr[a][b-1] == 1)
				count += dfs(a,b-1);
		return count;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		String in;
		for(int a=0; a<N; a++) {
			in = br.readLine();
			for(int b=0; b<N; b++)
				arr[a][b] = in.charAt(b) - '0';
		}
		
		for(int a=0; a<N; a++)
			for(int b=0; b<N; b++)
				if(arr[a][b] != 0)
					al.add(dfs(a,b));
		Collections.sort(al);
		sb.append(al.size()+"\n");
		for(int o : al)
			sb.append(o+"\n");
		System.out.println(sb);
	}
}
