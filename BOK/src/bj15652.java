import java.io.IOException;
import java.util.Scanner;

public class bj15652 {

	static int[] arr;
	static int[] visit;
	static StringBuilder sb = new StringBuilder();

	static void dfs(int n, int m, int d) {
		if (d == m) {
			for(int a=0; a<m-1; a++) {
				if(arr[a]>arr[a+1]) return;
			}
			for (int a = 0; a < m; a++)
				sb.append(arr[a] + " ");
			sb.append("\n");
			return;
		}
		for (int a = 1; a <= n; a++) {
			if (visit[a] != m) {
				visit[a]++;
				arr[d] = a;
				dfs(n, m, d + 1);
				visit[a] = 0;
			}
		}
		return;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[m];
		visit = new int[n + 1];
		for (int a = 0; a < m; a++)
			visit[a] = 0;
		dfs(n, m, 0);
		System.out.print(sb);

	}
}
