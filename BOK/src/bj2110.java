import java.util.*;
import java.io.*;

public class bj2110{
	static int N;
	static int C;
	static int[] arr;
	static boolean chk(int a) {
		int count = 1;
		int tem = arr[0];
		for(int x=1; x<N; x++) {
			if(arr[x] - tem >= a) {
				count++;
				tem = arr[x];
			}
		}
		if(C<=count)
			return true;
		else
			return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for(int a=0; a<N; a++)
			arr[a] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int s = 1;
		int f = arr[N-1]-arr[0];
		int mid = (s+f)/2;
		while(s<=f) {
			mid = (s+f)/2;
			if(chk(mid)) 
				s = mid+1;
			else 
				f = mid-1;
		}
		if(chk(mid))
			System.out.println(mid);
		else
			System.out.println(mid-1);
	}
}