import java.util.*;
import java.io.*;

public class bj14728 {
	static int N;
	static int ot;
	static int[][] arr;
	static int[][] dp;

	static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	static int dyn(int number, int time) {
		if (dp[number][time] != -1)
			return dp[number][time];
		if (number == N) {
			if (time < arr[number][0])
				return 0;
			else {
				return arr[number][1];
			}
		}
		if (time < arr[number][0])
			return dyn(number + 1, time);
			dp[number][time] = max(dyn(number + 1, time), dyn(number + 1, time - arr[number][0]) + arr[number][1]);
		return dp[number][time];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		ot = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][2];
		dp = new int[N + 1][ot + 1];
		for (int a = 0; a < N + 1; a++)
			for (int b = 0; b < ot + 1; b++)
				dp[a][b] = -1;
		for (int a = 0; a < N; a++) {
			st = new StringTokenizer(br.readLine());
			arr[a + 1][0] = Integer.parseInt(st.nextToken());
			arr[a + 1][1] = Integer.parseInt(st.nextToken());
		}

		System.out.println(dyn(1, ot));
	}
}
