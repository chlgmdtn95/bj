import java.util.*;
import java.io.*;

public class bj2581 {
	public static void main(String[] args) {
		int[] arr = new int[10001];
		arr[0]=1; arr[1] =1;
		for(int a=2; a<110; a++) {
			if(arr[a]==0)
				for(int b=2; b<5500; b++) {
					if(a*b>10000)
						break;
					arr[a*b] =1;
				}
		}
		
		int sum =0;
		int minimum = 10000;
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int a=M; a<=N; a++) {
			if(arr[a] ==0) {
				sum+= a;
				if(a<=minimum)
					minimum = a;
			}
		}
		
		if(sum == 0)
			System.out.print(-1); 
		else {
			System.out.println(sum);
			System.out.println(minimum);
		}
		
	}
}
