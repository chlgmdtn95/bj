import java.util.*;
public class bj14928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int ans = 0;
		for(int a=0; a<in.length(); a++) {
			ans = (ans*10%20000303 + (in.charAt(a)-48))%20000303;
		}
		System.out.println(ans);
	}
}
