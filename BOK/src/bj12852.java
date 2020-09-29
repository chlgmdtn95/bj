import java.util.*;

public class bj12852 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		int arr[] = new int[N+1];
		int sarr[] = new int[N+1];
		
		for(int a=1; a<=N; a++) {
			if(a %6 == 0) 
				arr[a] = Math.min(arr[a/3],Math.max(arr[a/2], arr[a-1])) + 1;
			else if(a %3 == 0)
				arr[a] = Math.min(arr[a/3], arr[a-1]) + 1;
			else if(a %2 == 0)
				arr[a] = Math.min(arr[a/2], arr[a-1]) + 1;
			else
				arr[a] = arr[a-1] + 1;
			
			if(a%3 == 0 & (arr[a]-1) == arr[a/3])
				sarr[a] = a/3;
			if(a%2 == 0 & (arr[a]-1) == arr[a/2])
				sarr[a] = a/2;
			if((arr[a]-1) == arr[a-1])
				sarr[a] = a-1;			
		}
		int i = N;
		sb.append(N);
		
		while(i != 1) {
			i = sarr[i];
			sb.append(" "+i);
		}
		
		System.out.println(arr[N]-1+"\n"+sb);
	}
}
