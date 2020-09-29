import java.util.*;
import java.io.*;

public class bj1753r {
	static int V, E, K;
	static ArrayList<ArrayList<Node>> al;
	static int[] dis;

	static class Node implements Comparable<Node> {
		int index, dis;

		public Node(int index, int dis) {
			this.index = index;
			this.dis = dis;
		}

		@Override
		public int compareTo(Node o) {
			return this.dis - o.dis;
		}
	}

	static void dick() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(al.get(K).get(0));
		int n;
		while (!pq.isEmpty()) {
			n = pq.poll().index;
			for (int a = 0; a < al.get(n).size(); a++) {
				if(dis[al.get(n).get(a).index] > al.get(n).get(a).dis + dis[n]) {
					dis[al.get(n).get(a).index] = al.get(n).get(a).dis + dis[n];
					pq.offer(al.get(n).get(a).index)
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		dis = new int[V + 1];
		al = new ArrayList<ArrayList<Node>>();

		for (int a = 0; a <= V; a++) {
			al.add(new ArrayList<Node>());
			dis[a] = 2000000000;
		}

		for (int a = 0; a < E; a++) {
			st = new StringTokenizer(br.readLine());
			al.get(Integer.parseInt(st.nextToken()))
					.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		dick();
		for (int a = 1; a <= V; a++) {
			if (dis[a] == 2000000000)
				sb.append("INF\n");
			else
				sb.append(dis[a] + "\n");
		}
		System.out.println(sb);
	}
}
