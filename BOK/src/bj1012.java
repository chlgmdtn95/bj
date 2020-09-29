import java.util.*;
import java.io.*;

public class bj1012 {
	static int[][] arr;
	static int M, N, K;
	static BufferedReader br;

	static void dfs(int a, int b) {
		arr[a][b] = 0;
		if (a > 0)
			if (arr[a - 1][b] == 1)
				dfs(a - 1, b);
		if (a < M - 1)
			if (arr[a + 1][b] == 1)
				dfs(a + 1, b);
		if (b > 0)
			if (arr[a][b - 1] == 1)
				dfs(a, b - 1);
		if (b < N - 1)
			if (arr[a][b + 1] == 1)
				dfs(a, b + 1);
	}

	static void tcase() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		int count = 0;

		for (int a = 0; a < M; a++)
			for (int b = 0; b < N; b++)
				arr[a][b] = 0;
		for (int a = 0; a < K; a++) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
		}
		for (int a = 0; a < M; a++)
			for (int b = 0; b < N; b++) {
				if (arr[a][b] == 1) {
					dfs(a, b);
					count++;
				}
			}
		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int a = 0; a < T; a++)
			tcase();
	}
}
