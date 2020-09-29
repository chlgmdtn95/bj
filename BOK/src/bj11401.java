import java.util.*;

public class bj11401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int p = 1000000007;
		long[] arr = new long[4000001];
		arr[0] = 1;
		for (int a = 1; a <= 4000000; a++)
			arr[a] = (arr[a-1]*(a%p))%p;
		long r = ((arr[K]%p)*(arr[N-K]%p))%p;
		
		long ans = 1;
		for(int a=0; a<5; a++)
			ans = (ans*r)%p;
		
		ans = (ans*arr[N])%p;
		
		long tr = r;
		for(int a=0; a<9; a++) {
			for(int b=0; b<9; b++)
				tr = (tr*r)%p;
			r = tr;
		}
		ans = (ans*tr)%p;
		System.out.println(ans);
	}
}
