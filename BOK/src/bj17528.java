import java.util.*;
import java.io.*;

public class bj17528 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] an = new int[N+1];
		int[] bn = new int[N+1];
		int tb = 0; int ta = 0;
		int ans = 1000000000;
		for (int a = 1; a <= N; a++) {
			st = new StringTokenizer(br.readLine());
			an[a] = Integer.parseInt(st.nextToken());
			bn[a] = Integer.parseInt(st.nextToken());
			ta += an[a];
			tb += bn[a];
		}
		int[][] dp = new int[N+1][tb+1];		
		for(int a=1; a<=N; a++) {
			for(int b=1; b<=tb; b++) {
				if(b<bn[a])
					dp[a][b] = dp[a-1][b];
				else {
					dp[a][b] = Math.max(dp[a-1][b-bn[a]]+an[a], dp[a-1][b]); 
				}
			}
		}
		for(int a=1; a<=N; a++) {
			for(int b=1; b<tb; b++) {
				ans = Math.min(ans, Math.max(ta - dp[a][b] , b));
			}
		}
		System.out.println(ans);
	}
}
