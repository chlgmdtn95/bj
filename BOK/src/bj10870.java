import java.util.*;

public class bj10870 {
	static int pibonacci (int count) {
		if(count==1)
			return 1;
		else if (count ==0)
			return 0;
		else {
			return pibonacci(count-1)+pibonacci(count-2);
		}
			

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.println(pibonacci(in));
	}
}
