import java.util.*;

public class bj13913 {
	static int N, K;
	static int memo[][];
	static boolean visit[];
	static boolean proc(int s, int time) {
		if (s < 0 | s > 2*Math.max(N, K)-1 | visit[s] == true)
			return false;
		if (s - 1 >= 0)
			if (memo[s - 1][0] == 0) {
				memo[s - 1][0] = time + 1;
				memo[s-1][1] = s;
			}
		if (s + 1 < 2*Math.max(N, K))
			if (memo[s + 1][0] == 0) {
				memo[s + 1][0] = time + 1;
				memo[s + 1][1] = s;
			}
		if (s * 2 < 2*Math.max(N, K))
			if (memo[s * 2][0] == 0) {
				memo[s * 2][0] = time + 1;
				memo[s * 2][1] = s;
			}
		visit[s] = true;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		K = sc.nextInt();

		memo = new int[2*Math.max(N, K)][2];
		visit = new boolean[2*Math.max(N, K)];
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(N);
		int tem;
		
		while (!q.isEmpty()) {
			tem = q.poll();
			if (proc(tem, memo[tem][0])) {
				if(tem +1 < 2*Math.max(N, K))
					q.offer(tem + 1);
				if(tem -1 >= 0)
					q.offer(tem - 1);
				if(tem*2 < 2*Math.max(N, K))
					q.offer(tem * 2);
			}
		}
		memo[N][0] = 0;
		sb.append(memo[K][0]+"\n");
		int ans = K;
		int out[] = new int[memo[K][0]+1];
		
		for(int a = memo[K][0]; a>=0; a--) {
			out[a] = ans;
			ans = memo[ans][1];
		}
		for(int a : out)
			sb.append(a+" ");
		System.out.println(sb);
		
		/* System.out.println();
		for(int a=0; a<=Math.max(N,K); a++)
			System.out.print(a+" ");
		System.out.println();
		for(int a=0; a<=Math.max(N, K); a++)
			System.out.print(memo[a][0]+" "); */
	}
}
