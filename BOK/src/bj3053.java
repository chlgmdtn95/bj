import java.util.*;
public class bj3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double pie = 3.14159265358979;
		
		System.out.println(String.format("%.6f", r*r*pie));
		System.out.println(String.format("%.6f", r*r*2));
	}
}
