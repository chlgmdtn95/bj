import java.util.*;
import java.io.*;

public class bj1753 {
	static int V, E, K;
	static int[] ans;
	static LiGra[] lg;
	static int[] diss;
	static int[] ar = new int[2];
	static int[] b;
	static class LiGra implements Comparable<LiGra> {
		int dis = 2000000000;
		ArrayList<int[]> al = new ArrayList<>();
		int[] ar = new int[2];
		int[] b;
		public void set(int a, int b) { 
			ar[0] = a;
			ar[1] = b;
			al.add(ar);
		}

		public int[] get(int a) {
			b = al.get(a);
			return b;
		}

		public int sizeGet() {
			return al.size();
		}

		public void disSet(int a) {
			this.dis = a;
		}

		@Override
		public int compareTo(LiGra o) {
			return o.dis - this.dis;
		}
	}

	static void dick() {
		PriorityQueue<LiGra> pq = new PriorityQueue<LiGra>();
		pq.offer(lg[K]);
		lg[K].disSet(0);
		LiGra tem;
		int[] temp;
		while (!pq.isEmpty()) {
			tem = pq.poll();
			for (int a = 0; a < tem.sizeGet(); a++) {
				temp = tem.get(a);
				if (lg[temp[0]] == null) {
					diss[temp[0]] = Math.min(diss[temp[0]], tem.dis + temp[1]);
				} else if ((tem.dis) + temp[1] < lg[temp[0]].dis) {
					pq.offer(lg[temp[0]]);
					lg[temp[0]].disSet(tem.dis + temp[1]);
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		lg = new LiGra[V + 1];
		ans = new int[V + 1];
		diss = new int[V + 1];
		boolean[] tes = new boolean[V + 1];
		for (int a = 1; a <= V; a++) {
			diss[a] = 2000000000;
			tes[a] = true;
			ans[a] = -1;
		}
		int t;
		for (int a = 0; a < E; a++) {
			st = new StringTokenizer(br.readLine());
			t = Integer.parseInt(st.nextToken());
			if (tes[t]) {
				lg[t] = new LiGra();
				lg[t].set(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
				tes[t] = false;
			} else {
				lg[t].set(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}

		}
		dick();
		StringBuilder sb = new StringBuilder();
		for (int a = 1; a <= V; a++) {
			if (lg[a] == null) {
				if(diss[a] == 2000000000)
					sb.append("INF\n");
				else
					sb.append(diss[a] + "\n");
			}
			else if (lg[a].dis == 2000000000)
				sb.append("INF\n");

			else
				sb.append(lg[a].dis + "\n");
		}
		System.out.println(sb);
	}
}