import java.util.*;
import java.io.*;

public class bj2178 {
	static int N;
	static int M;
	static int[][] arr;
	static int[][] arrp;
	static Queue<int[]> q = new LinkedList<>();

	static void test() {
		System.out.println();
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < M; b++)
				System.out.print(arrp[a][b] + "       ");
			System.out.println();
		}
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < M; b++)
				System.out.print(arr[a][b] + "       ");
			System.out.println();
		}
	}

	static void bfs() {
		while (!q.isEmpty()) {
			int[] x = q.poll();
			if (x[0] < N - 1)
				if (arr[x[0] + 1][x[1]] == 1) {
					q.offer(new int[] { x[0] + 1, x[1] });
					arr[x[0] + 1][x[1]] = 0;
					arrp[x[0] + 1][x[1]] = arrp[x[0]][x[1]] + 1;
				}
			if (x[0] > 0)
				if (arr[x[0] - 1][x[1]] == 1) {
					q.offer(new int[] { x[0] - 1, x[1] });
					arr[x[0] - 1][x[1]] = 0;
					arrp[x[0] - 1][x[1]] = arrp[x[0]][x[1]] + 1;
				}
			if (x[1] > 0)
				if (arr[x[0]][x[1] - 1] == 1) {
					q.offer(new int[] { x[0], x[1] - 1 });
					arr[x[0]][x[1] - 1] = 0;
					arrp[x[0]][x[1] - 1] = arrp[x[0]][x[1]] + 1;
				}
			if (x[1] < M - 1)
				if (arr[x[0]][x[1] + 1] == 1) {
					q.offer(new int[] { x[0], x[1] + 1 });
					arr[x[0]][x[1] + 1] = 0;
					arrp[x[0]][x[1] + 1] = arrp[x[0]][x[1]] + 1;
				}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		arrp = new int[N][M];
		for (int a = 0; a < N; a++)
			for (int b = 0; b < M; b++) {
				arr[a][b] = 0;
				arrp[a][b] = 0;
			}
		String str;
		for (int a = 0; a < N; a++) {
			str = br.readLine();
			for (int b = 0; b < M; b++)
				arr[a][b] = str.charAt(b) - '0';
		}
		arrp[0][0] = 1;
		q.offer(new int[] {0,0});
		bfs();
		System.out.println(arrp[N - 1][M - 1]);
	}
}