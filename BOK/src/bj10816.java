import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class bj10816 {
	static int[][] al;
	static int index;
	static int N;
	static int binaryS(int target) {
		int start = 0;
		int finish = N-1;
		int mid;
		while(start <= finish) {
			mid = (start+finish)/2;
			if(al[mid][0] > target)
				finish = mid - 1;
			else if (al[mid][0] < target)
				start = mid + 1;
			else
				return al[mid][1];
		}
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		int[] origin = new int[N];
		int[] tem = new int[N];
		al = new int[N][2];
		for(int a=0; a<N; a++)
			al[a][0] = -100000000;
		StringTokenizer st = new StringTokenizer(br.readLine());
		index = 0;
		for(int a=0; a<N; a++) 
			tem[a] = Integer.parseInt(st.nextToken());
		Arrays.sort(tem);

		origin[0] = 1;
		for (int a = 1; a < N; a++) {
			if (tem[a - 1] != tem[a]) {
				origin[a] = 1;
				al[index][0] = tem[a-1];
				al[index][1] = origin[a-1];
				index++;
			}
			else {
				origin[a] = origin[a - 1] + 1;				
			}
		}
		al[index][0] = tem[N-1];
		al[index][1] = origin[N-1];
		
		Arrays.sort(al, new Comparator<int[]>() {			
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int target;
		for (int a = 0; a < M; a++) {
			target = Integer.parseInt(st.nextToken());
			sb.append(binaryS(target)+" ");
		}
		System.out.println(sb);
	}
}
