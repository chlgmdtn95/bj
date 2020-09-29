import java.util.*;
import java.io.*;

public class bj1929 {
	public static void main(String[] args) {
		int[] arr = new int[1000001];
		arr[0]=1; arr[1] =1;
		for(int a=2; a<1001; a++) {
			if(arr[a]==0)
				for(int b=2; b<550000; b++) {
					if(a*b>1000000)
						break;
					arr[a*b] =1;
				}
		}
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int a=M; a<=N; a++) {
			if(arr[a] ==0) {
				System.out.println(a);
			}
		}
	}
}