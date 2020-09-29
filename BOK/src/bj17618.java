import java.util.*;

public class bj17618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tr = sc.nextInt();
		int funnyNumber=0; int tem; int divi;
		
		for(int a=0; a<=tr; a++) {
			divi=0; tem = a;
			for(int b=0; b<9; b++) {
				divi += tem%10;
				tem = tem/10;
			}
			if(divi!=0)
				if(a%divi==0)
				funnyNumber++;
		}
		System.out.println(funnyNumber);
	}
}
