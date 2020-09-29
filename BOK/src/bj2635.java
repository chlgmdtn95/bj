import java.util.*;

public class bj2635 {
	static int rpibo(int a, int b) {
		if(a-b<0)
			return 1;
		else
			return 1+rpibo(b,a-b);
	}
	static int printrpibo(int a, int b) {
		if(a-b<0) {
			System.out.print(a+" "+b+" ");
			return 1;
		}
		else {
			System.out.print(a+" ");
			return 1+printrpibo(b,a-b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxcount = 0;
		int t;
		int tindex=1;
		int N = sc.nextInt();
		for(int a=1; a<=N; a++){
			t = rpibo(N,a);
			if(maxcount<t) {
				tindex=a;
				maxcount = t;
			}
		}
		System.out.println(1+maxcount);
		printrpibo(N,tindex);
	}

}
