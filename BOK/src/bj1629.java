import java.util.*;

public class bj1629 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long[] arr = new long[32];
		long ans = 1;
		arr[0] = a % c;
		
		for (int x = 1; x < 32; x++)
			arr[x] = (arr[x - 1] * arr[x - 1]) % c;
		
		for (int x = 0; x < 32; x++) {
			if(b%2 != 0)
				ans = (ans * arr[x]) % c;
			b /= 2;
		}
		
		System.out.println(ans);
	}
}
