import java.util.*;
public class bj10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] tem = new int[10];
		int N = sc.nextInt();
		int ret=0;
		arr[0] = 0;
		tem[0] = 0;
		for(int a=1; a<10; a++) {
			arr[a] = 1;
			tem[a] = 1;
		}
		for(int a=0; a<N-1; a++ ) {
			tem[0] = arr[1];
			tem[9] = arr[8];
			for(int b=1; b<9; b++) {
				tem[b] = (arr[b-1]%1000000000+arr[b+1]%1000000000)%1000000000;
			}
			for(int b=0; b<10; b++)
				arr[b] = tem[b];
		}
		for(int a=0; a<10; a++)
			ret += arr[a]%1000000000;
		System.out.println(ret%1000000000);
	}
}
