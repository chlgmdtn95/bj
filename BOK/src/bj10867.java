import java.io.*;
import java.util.*;

public class bj10867 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int casnum = Integer.parseInt(st.nextToken());
		int[] cas = new int[casnum];
		st = new StringTokenizer(br.readLine());
		for(int a=0; a<casnum; a++) {
			cas[a] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cas);
		sb.append(cas[0]+" ");
		for(int a=1; a<casnum; a++) {
			if(cas[a]==cas[a-1])
				continue;
			sb.append(cas[a]+" ");
		}		
		System.out.print(sb);
	}
}
