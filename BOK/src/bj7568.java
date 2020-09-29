import java.io.*;
import java.util.*;

public class bj7568 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int casenumber = Integer.parseInt(st.nextToken());
		int[] weigh = new int[casenumber]; int[] height = new int[casenumber];int[] rank = new int[casenumber];
		
		for(int a=0; a<casenumber; a++) {
			st = new StringTokenizer(br.readLine());
			weigh[a] = Integer.parseInt(st.nextToken()); height[a] =Integer.parseInt(st.nextToken());
		}
		
		for(int a=0; a<casenumber; a++)
			rank[a] =1;
		
		for(int a=0; a<casenumber; a++) {
			for(int b=0; b<casenumber; b++ ) {
				if((weigh[a]<weigh[b])&(height[a]<height[b]))
					rank[a]++;
			}
		}
		for(int a=0; a<casenumber; a++)
			bw.write(rank[a]+" ");
		
		bw.flush();
		bw.close();
	}

}
