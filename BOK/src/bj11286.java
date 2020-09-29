import java.util.*;
import java.io.*;
public class bj11286 {
	static class arr implements Comparable<arr>{
		int a;
		int b;
		public arr(int x, int y) {
			this.a = x;
			this.b = y;
		}
		@Override
		public int compareTo(arr o) {
			if(this.b == o.b)
				return this.a - o.a;
			return this.b - o.b;
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<arr> pq  = new PriorityQueue<arr>();
		arr in;
		int tem;
		arr tt;
		for(int z=0; z<N; z++) {
			tem = Integer.parseInt(br.readLine());
			if(tem < 0)
				in = new arr(tem, -1*tem);
			else
				in = new arr(tem, tem);
			
			if(tem == 0) {
				if(pq.isEmpty())
					sb.append(0+"\n");
				else {
					tt = pq.poll();
					sb.append(tt.a+"\n");
				}					
			}
			else
				pq.offer(in);
		}
		System.out.println(sb);
	}
}
