import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testtest {
	
	static int n, d[], k, a[], ten[];
	static String b[];
	static long p, q, dp[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new int [n];
		b = new String [n];
		d = new int [n];
		p = 0;
		q = 1;		
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			b[i] = s;
			d[i] = s.length();
			q*=(i+1);
		}
		k = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			String s = b[i];
			for (int j=0; j<s.length(); j++) {
				a[i] = a[i]*10 + b[i].charAt(j)-'0';
				a[i] %= k;
			}
		}
		ten = new int [51];
		ten[0] = 1;
		for (int i=1; i<51; i++) {
			ten[i] = ten[i-1]*10;
			ten[i] %= k;
		}
		dp = new long [1<<n][k];
		dp[0][0]=1;
		for (int i=0; i<(1<<n); i++) {
			for (int j=0;j<k; j++) {
				for (int l=0; l<n; l++) {
					if ((i&(1<<l))==0 && dp[i][j]>0) {
						int next = j*ten[d[l]];
						next %= k;
						next += a[l];
						next %=k;
						dp[i|(1<<l)][next] += dp[i][j];
					}
				}
			}
		}
		p = dp[(1<<n)-1][0];
		if (p==0) {
			System.out.println("0/1");
		}else {
			long p1 = p;
			long q1 = q;
			while (p1>0) {
				long x = p1;
				p1 = q1%p1;
				q1 = x;
			}
			System.out.println(p/q1+"/"+q/q1);
 		}
	}
}