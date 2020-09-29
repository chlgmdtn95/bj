import java.util.*;

public class bj13118 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int p1=sc.nextInt(), p2=sc.nextInt(), p3=sc.nextInt(), p4=sc.nextInt();
		int x=sc.nextInt(), y=sc.nextInt(), r=sc.nextInt();
		
		if(x==p1) System.out.println(1);
		else if (x==p2) System.out.println(2);
		else if (x==p3) System.out.println(3);
		else if (x==p4) System.out.println(4);
		else System.out.println(0);
	}
}
