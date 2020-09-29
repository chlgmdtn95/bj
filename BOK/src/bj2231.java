import java.util.*;

public class bj2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputnumber = sc.nextInt();
		int temp; int position; int ans=0;
		for (int b = 1; b < inputnumber + 1; b++) {
			temp = b; position = b;
			for (int a = 0; a < 7; a++) {
				position += temp % 10;
				temp /= 10;
			}
			if(position == inputnumber) {
				ans = b;
				break;
			}
		}
		System.out.println(ans);
	}
}
