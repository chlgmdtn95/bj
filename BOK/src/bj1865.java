import java.util.*;
import java.io.*;

public class bj1865 {
	static int N, M, W;
	static ArrayList<Node>[] al;
	static int[] distance;
	static StringBuilder sb = new StringBuilder();
	static class Node implements Comparable<Node> {
		int index;
		int distance;

		public Node(int a, int b) {
			this.index = a;
			this.distance = b;
		}

		@Override
		public int compareTo(Node o) {
			return this.distance - o.distance;
		}

	}

	static void solv() {

		for (int a = 0; a < N - 1; a++) {
			for (int b = 1; b <= N; b++) {
				for (Node node : al[b]) {
					if (distance[node.index] > distance[b] + node.distance)
						distance[node.index] = distance[b] + node.distance;
				}
			}
		}
		for (int b = 1; b <= N; b++) {
			for (Node node : al[b]) {
				if (distance[node.index] > distance[b] + node.distance) {
					sb.append("YES\n");
					return;
				}
			}
		}
		sb.append("NO\n");

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int TC = Integer.parseInt(br.readLine());
		int i, f, l;

		for (int a = 0; a < TC; a++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			al = new ArrayList[N + 1];
			distance = new int[N + 1];
			for (int b = 0; b < N + 1; b++) {
				al[b] = new ArrayList<Node>();
				distance[b] = 2000000000;
			}
			for (int b = 0; b < M; b++) {
				st = new StringTokenizer(br.readLine());
				i = Integer.parseInt(st.nextToken());
				f = Integer.parseInt(st.nextToken());
				l = Integer.parseInt(st.nextToken());
				al[i].add(new Node(f, l));
				al[f].add(new Node(i, l));
			}
			for (int b = 0; b < W; b++) {
				st = new StringTokenizer(br.readLine());
				i = Integer.parseInt(st.nextToken());
				f = Integer.parseInt(st.nextToken());
				l = Integer.parseInt(st.nextToken());
				al[i].add(new Node(f, (-1)*l));
			}
			solv();
		}
		System.out.println(sb);
	}
}
