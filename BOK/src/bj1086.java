import java.util.*;

public class bj1086 {
	static int N, K;
	static int arr[];
	static long dp[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tem;
		String inarr[];
		int t;
		int next;
		N = sc.nextInt();
		arr = new int[N];
		inarr = new String[N];
		sc.nextLine();
		long tt = 1;
		for (int a = 1; a <= N; a++) {
			inarr[a-1] = sc.nextLine();
			tt *= a;
		}

		K = sc.nextInt();
		dp = new long[(1 << N)][K];
		for (int a = 0; a < N; a++) {
			t = 1;
			for (int b = 0; b < inarr[a].length(); b++) {
				arr[a] = (arr[a] + (inarr[a].charAt(inarr[a].length() - 1 - b) - '0') * t) % K;
				t *= 10;
				t %=K;
			}
		}
		
		for(int a=0; a<N; a++) {
			// System.out.println(arr[a]);
			dp[1<<a][arr[a]] = 1;
		}
		
		for (int a = 0; a < (1 << N); a++) {
			for (int b = 0; b < N; b++) {
				if ((a & (1 << b)) == 0) {
					for (int c = 0; c < K; c++) {
						if (dp[a][c] != 0) {
							next = c;
							for (int d = 0; d < inarr[b].length(); d++) {
								next = (next * 10)%K;
							}
							next = (next + arr[b])%K;
							dp[(a | (1 << b))][next] += dp[a][c];
						}
					}
				}
			}
		}
		/* for(int a=0; a<(1<<N); a++) {
			System.out.print("a="+a+" ");
			for(int b=0; b<K; b++)
				System.out.print(dp[a][b]+" ");
			System.out.println();
		} */
		long ans = dp[(1<<N)-1][0];
		if (ans==0) {
			System.out.println("0/1");
		}else {
			long p1 = ans;
			long q1 = tt;
			while (p1>0) {
				long x = p1;
				p1 = q1%p1;
				q1 = x;
			}
			System.out.println(ans/q1+"/"+tt/q1);
 		}
	}
}