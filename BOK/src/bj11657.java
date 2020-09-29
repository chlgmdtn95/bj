import java.util.*;
import java.io.*;

public class bj11657 {
	static int N, M;
	static ArrayList<ArrayList<Node>> al;
	static long[] distance;
	static boolean[] chk;

	static class Node implements Comparable<Node> {
		int index;
		long distance;

		public Node(int a, long b) {
			this.index = a;
			this.distance = b;
		}

		@Override
		public int compareTo(Node o1) {
			return (int)(this.distance - o1.distance);
		}
	}

	static void dic() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int now;
		for (int a = 0; a < N - 1; a++) {
			for (ArrayList<Node> arl : al) {
				now = al.indexOf(arl);
				for (Node n : arl) {
					if ((distance[n.index] > distance[now] + n.distance) & chk[now] == true) {
						distance[n.index] = distance[now] + n.distance;
						chk[n.index] = true; 
					}
				}
			}
		}
		for (ArrayList<Node> arl : al) {
			now = al.indexOf(arl);
			for (Node n : arl) {
				if ((distance[n.index] > distance[now] + n.distance)& chk[n.index] == true) {
					System.out.print(-1);
					return;
				}
			}
		}
		for (int a = 2; a <= N; a++) {
			if (distance[a] == 2000000000L)
				System.out.println(-1);
			else
				System.out.println(distance[a]);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		al = new ArrayList<ArrayList<Node>>();
		distance = new long[N + 1];
		chk = new boolean[N + 1];
		for (int a = 0; a <= N; a++) {
			al.add(new ArrayList<Node>());
			distance[a] = 2000000000L;
			chk[a] = false;
		}
		chk[1] = true;
		distance[1] = 0L;
		for (int a = 0; a < M; a++) {
			st = new StringTokenizer(br.readLine());
			al.get(Integer.parseInt(st.nextToken()))
					.add(new Node(Integer.parseInt(st.nextToken()), Long.parseLong(st.nextToken())));
		}
		dic();
	}
}