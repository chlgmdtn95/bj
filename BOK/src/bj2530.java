import java.util.*;
public class bj2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(); int min = sc.nextInt(); int sec=sc.nextInt(); int D=sc.nextInt();
		
		sec+=D; min+=sec/60; sec%=60; hour+=min/60; min%=60; hour%=24;
		
		System.out.println(hour+" "+min+" "+sec);
	}
}
