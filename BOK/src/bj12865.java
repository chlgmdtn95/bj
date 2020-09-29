import java.util.*;
import java.io.*;

public class bj12865 {
	static int K;
	static int N;
	static int[] weight;
	static int[] value;
	static int[][] dp;

	static int max(int a, int b) {
		if (a < b)
			return b;
		else
			return a;
	}

	static int knapsack(int n, int w) {
		if (n == N-1) {
			if (w < weight[n])
				return 0;
			return value[n];
		}
		if (w < weight[n])
			return knapsack(n + 1, w);
		if(dp[n+1][w-weight[n]] != -1 & dp[n+1][w] != -1)
			dp[n][w] = max(dp[n+1][w-weight[n]]+value[n], dp[n+1][w]);
		else if(dp[n+1][w-weight[n]] != -1)
			dp[n][w] = max(dp[n+1][w-weight[n]]+value[n], knapsack(n + 1, w));
		else if(dp[n+1][w] != -1)
			dp[n][w] = max(knapsack(n + 1, w - weight[n]) + value[n], dp[n + 1][w]);
		else
			dp[n][w] = max(knapsack(n + 1, w - weight[n]) + value[n], knapsack(n + 1, w));
		return dp[n][w];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		weight = new int[N];
		value = new int[N];
		dp = new int[N][1000001];
		for(int a=0; a<N; a++)
			for(int b=0; b<1000001; b++)
				dp[a][b] = -1;
		for (int a = 0; a < N; a++) {
			st = new StringTokenizer(br.readLine());
			weight[a] = Integer.parseInt(st.nextToken());
			value[a] = Integer.parseInt(st.nextToken());
		}
		System.out.println(knapsack(0,K));
	}
}
