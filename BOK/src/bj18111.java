import java.util.*;
import java.io.*;

public class bj18111 {
	static int arr[];
	static int number, B;
	static int getNumber(int num) {
		int re = 0;
		int n = B;
		for(int a=0; a<number; a++) {
			if(num > arr[a]) {
				re += num - arr[a];
				n -= num - arr[a];
			}
			else {
				re += 2*(arr[a] - num);
				n += arr[a] - num;
			}
		}
		if(n < 0)
			return -1;
		else
			return re;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		number = N * M;
		arr = new int[number];

		for (int a = 0; a < N; a++) {
			st = new StringTokenizer(br.readLine());
			for (int b = 0; b < M; b++) {
				arr[M * a + b] = Integer.parseInt(st.nextToken());
			}
		}
		
		int ans[] = new int[257];
		for(int a=0; a<=256; a++)
			ans[a] = 2000000000;
		
		for(int a=0; a<=256; a++) {
			if(getNumber(a) < 0) 
				break;
			ans[a] = getNumber(a);			
		}
		
		int minindex = 0;
		int min = ans[0];
		for(int a=0; a<=256; a++) {
			if(min >= ans[a]) {
				minindex = a;
				min = ans[a];
			}
		}
		System.out.println(min + " " + minindex);
	}
}
