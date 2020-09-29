import java.util.*;
import java.io.*;

public class bj7576 {
	static int M, N;
	static int[][] arr;
	static Queue<int[]> q = new LinkedList<>();
	static int day;
	static int count1, count2, count3;

	static void test() {
		System.out.println();
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < M; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}
	}

	static void BFS() {
		int[] x;
		while (!q.isEmpty()) {
			x = q.poll();
			count2++;
			if (x[0] < N - 1)
				if (arr[x[0] + 1][x[1]] == 0) {
					q.offer(new int[] { x[0] + 1, x[1] });
					arr[x[0] + 1][x[1]] = 1;
					count3++;
				}
			if (x[0] > 0)
				if (arr[x[0] - 1][x[1]] == 0) {
					q.offer(new int[] { x[0] - 1, x[1] });
					arr[x[0] - 1][x[1]] = 1;
					count3++;
				}
			if (x[1] > 0)
				if (arr[x[0]][x[1] - 1] == 0) {
					q.offer(new int[] { x[0], x[1] - 1 });
					arr[x[0]][x[1] - 1] = 1;
					count3++;
				}
			if (x[1] < M - 1)
				if (arr[x[0]][x[1] + 1] == 0) {
					q.offer(new int[] { x[0], x[1] + 1 });
					arr[x[0]][x[1] + 1] = 1;
					count3++;
				}
			if (count1 == count2) {
				day++;
				count1 = count3;
				count2 = 0;
				count3 = 0;
				test();
			}
		}
	}
	
	static boolean er() {
		for(int a=0; a<N; a++)
			for(int b=0; b<M; b++)
				if(arr[a][b] == 0)
					return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		day = 0;
		count1 = 0;
		count2 = 0;
		count3 = 0;
		for (int a = 0; a < N; a++) {
			st = new StringTokenizer(br.readLine());
			for (int b = 0; b < M; b++) {
				arr[a][b] = Integer.parseInt(st.nextToken());
				if (arr[a][b] == 1) {
					q.offer(new int[] { a, b });
					count1++;
				}
			}
		}
		BFS();
		if(er()) {
			System.out.println(-1);
			return;
		}
		System.out.println(day-1);
	}
}
