import java.util.*;

public class bj10804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] init = new int[10]; int[] fin=new int[10]; int temp=0;
		int[] arr = new int[20];
		
		for(int a=0; a<20; a++) {
			arr[a]=a+1;
		}
		
		for(int a=0; a<10; a++) {
			init[a] = sc.nextInt(); fin[a] = sc.nextInt();
		}
		
		for(int a=0; a<10; a++) {
			for(int b=init[a]-1; b<(fin[a]+init[a]-1)/2; b++) {
				temp=arr[b]; arr[b]=arr[fin[a]+init[a]-b-2]; arr[fin[a]+init[a]-b-2]=temp;
			}
		}
		
		for(int a=0; a<20; a++) {
			System.out.print(arr[a]+" ");
		}
	}
}
