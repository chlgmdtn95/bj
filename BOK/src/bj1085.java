import java.util.*;

public class bj1085 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[4];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt()-arr[0];
		arr[3] = sc.nextInt()-arr[1];
		
		Arrays.sort(arr);
		System.out.println(arr[0]);		
		
	}
}
