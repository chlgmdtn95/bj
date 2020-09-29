import java.util.*;

public class bj15969 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casenumber = sc.nextInt();
		int[] cas = new int[casenumber];
		
		for(int a=0; a<casenumber; a++) {
			cas[a] = sc.nextInt();
		}
		
		Arrays.sort(cas);
		
		System.out.println(cas[casenumber-1]-cas[0]);
	}
}
