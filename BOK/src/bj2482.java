import java.util.*;

public class bj2482 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
				
		if((N/2)<K) {
			System.out.println(0+"");
			return;
		}
		
		int memo1[][] = new int[1001][1001];
		int memo2[][] = new int[1001][1001];
		
		memo1[4][1] = 4;
		memo1[4][2] = 3;
		memo1[5][1] = 5;
		memo1[5][2] = 6;
		memo1[5][3] = 1;
		
		for(int a=6; a<=N; a++) {
			for(int b=1; b<=(a/2+1); b++) {
				if(b == 1)
					memo1[a][b] = a;
				else
					memo1[a][b] = memo1[a-2][b-1] + memo1[a-1][b];
			}
		}
		
		memo2[4][1] = 4;
		memo2[4][2] = 2;
		memo2[5][1] = 5;
		memo2[5][2] = 5;
		memo2[6][1] = 6;
		memo2[6][2] = 9;
		memo2[6][3] = 2;
		
		for(int a=7; a<=N; a++) {
			for(int b=1; b<=a/2; b++) {
				if(b == 1)
					memo2[a][b] = a;
				else
					memo2[a][b] = memo1[a-3][b-1] + memo1[a-1][b];
			}
		}
		
		for(int a=1; a<=N; a++) {
			for(int b=1; b<=a/2; b++) {
				System.out.println(a+" "+b+": "+memo2[a][b] + " " + memo1[a][b]); 
			}
		}
		
		 System.out.println(memo2[N][K]);
	}
}
