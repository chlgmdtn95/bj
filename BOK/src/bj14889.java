import java.util.*;
import java.io.*;

public class bj14889 {
	static int[][] arr;
	static int[] c;
	static int[] nc;
	static int N;
	static int ss = 0;
	static int mindiff = 2000000000;

	static void com(int p, int q, int visit[]) {
		int A, B;
		int point;
		boolean ck;
		if (p == N / 2) {
			A = 0;
			B = 0;
			point = 0;
			for (int a = 0; a < N; a++) {
				ck = true;
				if (point == N / 2)
					break;
				for (int b = 0; b < N / 2; b++) {
					if (a == c[b]) {
						ck = false;
						break;
					}					
				}
				if (ck == true) {
						nc[point] = a;
						point++;
				}
			}
			for (int a = 0; a < N / 2; a++) {
				for (int b = 0; b < N / 2; b++) {
					B += arr[nc[a]][nc[b]];
				}
			}
			for (int a = 0; a < N / 2; a++) {
				for (int b = 0; b < N / 2; b++) {
					A += arr[c[a]][c[b]];
				}
			}
			if (A - B > 0) {
				if (A - B < mindiff)
					mindiff = A - B;
			} else {
				if (B - A < mindiff)
					mindiff = B - A;
			}
			return;
		}

		for (int a = q; a < N; a++) {
			if (visit[a] != 1) {
				c[p] = a;
				visit[a] = 1;
				com(p + 1, a, visit);
				visit[a] = 0;
			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		int[] visit = new int[N];
		c = new int[N / 2];
		nc = new int[N / 2];
		for (int a = 0; a < N; a++)
			visit[a] = 0;
		for (int a = 0; a < N; a++) {
			st = new StringTokenizer(br.readLine());
			for (int b = 0; b < N; b++)
				arr[a][b] = Integer.parseInt(st.nextToken());
		}
		com(0, 0, visit);
		System.out.println(mindiff);

	}

}
