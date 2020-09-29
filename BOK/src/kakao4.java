import java.util.*;
import java.io.*;

public class kakao4 {
	static class Node implements Comparable<Node>{
		int start;
		int distance;
		public Node(int start,  int distance) {
			this.start = start;
			this.distance = distance;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return o.distance - this.distance;
		}
		
	}
	static int findFare(int start, int end, int[][] map, int n) {
		boolean visit[] = new boolean[n+1];
		int distance[] = new int[n+1];
		for(int a=1; a<=n; a++) 
			distance[a] = 2000000000;
		distance[start] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start,0));
		Node tem;
		while(!pq.isEmpty()) {
			tem = pq.poll();
			if(!visit[tem.start]) {
				for(int a=1; a<=n; a++) {
					if(map[tem.start][a] != 0) {
						if(distance[a] > distance[tem.start] + map[tem.start][a]) {
							distance[a] = distance[tem.start] + map[tem.start][a];
							pq.offer(new Node(a, map[tem.start][a]));
						}
					}
				}
				visit[tem.start] = true;
			}
		}
		System.out.print(start+" "+end+": ");
		for(int a : distance)
			System.out.print(a+" ");
		System.out.println();
		
		return distance[end];
	}
	static int solution (int n, int s, int a, int b, int[][] fares) {
		int map[][] = new int[n+1][n+1];
		for(int i=0; i<fares.length; i++) {
			map[fares[i][0]][fares[i][1]] = fares[i][2];
			map[fares[i][1]][fares[i][0]] = fares[i][2];
		}
		
		/* for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++)
				System.out.print(map[i][j] + " ");
			System.out.println();
		} */
		
		int ans[] = new int[4];
		ans[0] = findFare(s,a,map,n);
		ans[1] = findFare(s,b,map,n);
		ans[2] = findFare(a,b,map,n);
		ans[3] = findFare(b,a,map,n);
		
		int realans[] = new int[3];
		realans[0] = ans[0] + ans[2];
		realans[1] = ans[0] + ans[1];
		realans[2] = ans[1] + ans[3];
		
		Arrays.sort(realans);
		return realans[0];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int number = 9;
		int fares[][] = new int[number][3];
		StringTokenizer st;
		
		for (int i = 0; i < number; i++) {
			st = new StringTokenizer(br.readLine());
			fares[i][0] = Integer.parseInt(st.nextToken());
			fares[i][1] = Integer.parseInt(st.nextToken());
			fares[i][2] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n,s,a,b,fares));

	}
}
