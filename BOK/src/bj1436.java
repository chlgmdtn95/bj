import java.util.*;

public class bj1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputnumber = sc.nextInt();
		int count =0; String compareString;
		for(int a=665; a<666666666; a++) {
			compareString = Integer.toString(a);
			for(int b=0; b<compareString.length(); b++) {
				if((compareString.charAt(b)=='6')&(b<compareString.length()-2))
					if((compareString.charAt(b+1)=='6')&(compareString.charAt(b+2)=='6')) {count++; break;}
			}
			if(count == inputnumber) {
				count =a; break;
			}
		}
		System.out.println(count);
	}
}
