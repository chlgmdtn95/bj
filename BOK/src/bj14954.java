import java.util.*;

public class bj14954 {
	static int getN(int a) {
		int rr=(a%10)*(a%10);
		while(a/10 > 0) {
			a/=10;
			rr += (a%10)*(a%10);			
		}
		return rr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		boolean memo[] = new boolean[900];
		
		for(int i=0; i<900; i++)
			memo[i] = false;
		
		while (1 < 2) {
			in = getN(in);
			if(in == 1) {
				System.out.println("HAPPY");
				return;
			}
			if(memo[in] == true) {
				System.out.println("UNHAPPY");
				return;
			}
			memo[in] = true;
		}
	}
}
