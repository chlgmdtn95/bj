import java.util.*;

public class bj11501 {
	public static void main(String[] args) {
		int dp[] = new int[1000001];
		Scanner sc = new Scanner(System.in);
		dp[3] = 0;
		dp[4] = 1;
		dp[5] = 2;
		dp[6] = 2;
		
		for(int i=7 ; i<1000001; i++) {
	        if (i%2 != 0) dp[i] = dp[(i/2)+1] + 2;
	        else { dp[i] = dp[i/2] + 2; }
	    }
		System.out.println(dp[sc.nextInt()]);
	}
}
