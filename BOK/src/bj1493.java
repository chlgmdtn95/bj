import java.util.*;
import java.io.*;

public class bj1493 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken()); int w = Integer.parseInt(st.nextToken()); int h = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		long[][] arr = new long[N][3];
		int div; int ret=0; long ff;
		for(int a=0; a<N; a++) {
			st = new StringTokenizer(br.readLine());
			arr[a][0] = (long) Math.pow(2, Long.parseLong(st.nextToken())); arr[a][1] = Long.parseLong(st.nextToken()); arr[a][2]=0;
		}
		
		Arrays.sort(arr,new Comparator<long[]>() {
			public int compare(long[] o1, long[] o2) {
				if(o1[0] - o2[0]>0)
					return 1;
				else
					return -1;
			}
		});
		
		if(!(l%arr[0][0] == 0 & w%arr[0][0] ==0 & h%arr[0][0] == 0)) {
			System.out.println(-1);
			return;
		}
		arr[0][2] = (l/arr[0][0]) * (w/arr[0][0]) * (h/arr[0][0]);
		for(int a=0; a<N-1; a++) {
			div = (int)Math.pow((arr[a+1][0]/arr[a][0]),3);
			ff = (l/arr[a+1][0]) * (w/arr[a+1][0]) * (h/arr[a+1][0]);
			arr[a+1][2] = ff;
			arr[a][2] -= ff*div;
		}
		for(int a=N-1; a>0; a--) {
			div = (int)Math.pow((arr[a][0]/arr[a-1][0]),3);
			while(arr[a][2]>arr[a][1]) {
				arr[a-1][2]+=div*(arr[a][2]-arr[a][1]);
				arr[a][2] = arr[a][1];
			}
		}
		if(arr[0][2]>arr[0][1]) {
			System.out.println(-1);
			return;
		}
		for(int a=0; a<N; a++) {
			ret += arr[a][2];
		}
		System.out.println(ret);
	}
}
