import java.util.*;

public class bj3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[2];
		int[] y = new int[2];
		x[0] = sc.nextInt();
		y[0] = sc.nextInt();
		
		x[1] = sc.nextInt();
		y[1] = sc.nextInt();
		
		if(x[0]==x[1])
			x[0] = sc.nextInt();
		else {
			if(x[0]==sc.nextInt())
				x[0]=x[1];
		}
		
		if(y[0]==y[1])
			y[0] = sc.nextInt();
		else{
			if(y[0]==sc.nextInt())
				y[0]=y[1];
		}
		
		System.out.println(x[0]+" "+y[0]);
	}
}
