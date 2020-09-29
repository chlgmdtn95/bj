import java.util.*;
import java.io.*;

public class bj17362 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		int ans =0; int add = 1;
		for(int a=0;  a<numb; a++) {
			ans += add; 
			if(ans > 5) {
				add = -1;
				ans = 4;
			}
			if(ans < 1) {
				add = 1;
				ans = 2;
			}
		}
		
		System.out.println(ans);
	}
}
