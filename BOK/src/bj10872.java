import java.util.*;

public class bj10872 {
	static int factorial(int a) {
		if(a==1)
			return 1;
		else {
			return a*= factorial(a-1);
		}
				
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		if(in ==0)
			System.out.println(1);
		else
			System.out.println(factorial(in));
	}
}
