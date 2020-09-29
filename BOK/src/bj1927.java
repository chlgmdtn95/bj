import java.util.*;
import java.io.*;
public class bj1927 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq  = new PriorityQueue<Integer>();
		int in;
		for(int a=0; a<N; a++) {
			in = Integer.parseInt(br.readLine());
			if(in == 0)
				if(pq.isEmpty())
					sb.append(0+"\n");
				else
					sb.append(pq.poll()+"\n");
			else
				pq.offer(in);
		}
		System.out.println(sb);
	}
}
