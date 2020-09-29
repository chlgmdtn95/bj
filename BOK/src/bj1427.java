import java.util.*;

public class bj1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputnumber = sc.nextInt(); int cypher=0; int[] num = new int[10];
		
		for(int a=0; a<10; a++) {
			if(inputnumber/10==0) {
				num[a] = inputnumber%10;
				break;
			}
			num[a] = inputnumber%10;
			inputnumber /= 10;
			cypher++;
		}
		
		int[] rea = new int[cypher+1];
		for(int a=0; a<cypher+1 ; a++) {
			rea[a] = num[a];
		}
		Arrays.sort(rea);
		for(int a=0; a<cypher+1; a++)
			System.out.print(rea[cypher-a]);
	}
}
