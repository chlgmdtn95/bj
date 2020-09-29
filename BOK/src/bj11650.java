import java.util.*;
import java.io.*;

public class bj11650 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int numberofcase = Integer.parseInt(st.nextToken());
		int[][] arr = new int[numberofcase][2];
		
		for(int a =0; a<numberofcase; a++) {
			st= new StringTokenizer(br.readLine());
			arr[a][0] = Integer.parseInt(st.nextToken());
			arr[a][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0])
					return o1[1]-o2[1];
				else
					return o1[0]-o2[0];
			}
		});
		
		for(int a=0; a<numberofcase; a++) {
			bw.write(String.valueOf(arr[a][0])+" "+String.valueOf(arr[a][1])+"\n");
		}
		bw.flush();
		bw.close();
	}
}
