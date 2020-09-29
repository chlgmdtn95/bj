import java.util.*;
import java.io.*;

public class bj11651 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int numberOfCase = Integer.parseInt(st.nextToken()); 
		int[][] cas = new int[numberOfCase][2];
		for(int a=0; a<numberOfCase; a++) {
			st= new StringTokenizer(br.readLine());
			cas[a][0] = Integer.parseInt(st.nextToken());
			cas[a][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cas, new Comparator <int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1])
					return o1[0]-o2[0];
				else
					return o1[1]-o2[1];
			}
		});
		
		for(int a=0; a<numberOfCase; a++) {
			bw.write(String.valueOf(cas[a][0])+" "+String.valueOf(cas[a][1])+"\n");
		}		
		bw.flush();
		bw.close();
	}
}
