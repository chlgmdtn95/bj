import java.util.*;
import java.io.*;

public class bj17404 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[][] = new int[N][3];
		int memo[][][] = new int[N][3][3];
		
		for (int a = 0; a < N; a++) {
			st = new StringTokenizer(br.readLine());
			arr[a][0] = Integer.parseInt(st.nextToken());
			arr[a][1] = Integer.parseInt(st.nextToken());
			arr[a][2] = Integer.parseInt(st.nextToken());
		}
		
		memo[0][0][0] = arr[0][0];
		memo[0][0][1] = arr[0][1];
		memo[0][0][2] = arr[0][2];
		
		memo[1][0][0] = 2000000000;
		memo[1][1][0] = arr[0][0] + arr[1][1];
		memo[1][2][0] = arr[0][0] + arr[1][2];
		
		memo[1][1][1] = 2000000000;
		memo[1][0][1] = arr[0][1] + arr[1][0];
		memo[1][2][1] = arr[0][1] + arr[1][2];
		
		memo[1][2][2] = 2000000000;
		memo[1][0][2] = arr[0][2] + arr[1][0];
		memo[1][1][2] = arr[0][2] + arr[1][1];
		
		for(int a=2; a<N; a++) {
			memo[a][0][0] = Math.min(memo[a-1][1][0], memo[a-1][2][0]) + arr[a][0];
			memo[a][1][0] = Math.min(memo[a-1][0][0], memo[a-1][2][0]) + arr[a][1];
			memo[a][2][0] = Math.min(memo[a-1][0][0], memo[a-1][1][0]) + arr[a][2];
			
			memo[a][0][1] = Math.min(memo[a-1][1][1], memo[a-1][2][1]) + arr[a][0];
			memo[a][1][1] = Math.min(memo[a-1][0][1], memo[a-1][2][1]) + arr[a][1];
			memo[a][2][1] = Math.min(memo[a-1][0][1], memo[a-1][1][1]) + arr[a][2];
		
			memo[a][0][2] = Math.min(memo[a-1][1][2], memo[a-1][2][2]) + arr[a][0];
			memo[a][1][2] = Math.min(memo[a-1][0][2], memo[a-1][2][2]) + arr[a][1];
			memo[a][2][2] = Math.min(memo[a-1][0][2], memo[a-1][1][2]) + arr[a][2];
		}
		
		int ans[] = new int[6];
		ans[0] = memo[N-1][0][1];
		ans[1] = memo[N-1][0][2];
		ans[2] = memo[N-1][1][0];
		ans[3] = memo[N-1][1][2];
		ans[4] = memo[N-1][2][0];
		ans[5] = memo[N-1][2][1];
		
		Arrays.sort(ans);
		System.out.println(ans[0]);
	}
}
