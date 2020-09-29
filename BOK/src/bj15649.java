import java.util.*;
import java.io.*;
public class bj15649 {
	static boolean isIn(int[] arr, int numb) {
		boolean is=false;
		for(int a=0; a<arr.length; a++) {
			if(numb == arr[a])
				is = true;
		}
		return is;
	} 
	
	static boolean ret(int[] arr) {
		boolean tt = true;
		int[] ch = new int[8];
		for(int a=0; a<8; a++) ch[a] =0;
		for(int a=0; a<arr.length; a++) {
			if(arr[a]==0) break;
			ch[arr[a]-1]++;
			if(ch[arr[a]-1]==2) {
				tt=false;
				break;
			}
		}
		return tt;
	}
	
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int M = sc.nextInt();
		int[] arr  = new int[N];
		int[] numbers = new int[8];
		for(int a=0; a<N; a++) arr[a]=a+1;
		int ch; int flag =1;
		int las=1; int count;
		for(int a=0; a<M-1; a++) {
			las*=10;
		}
		StringBuilder sb = new StringBuilder();
		for(int a=las; a<las*9; a++) {
				for(int b=0; b<8; b++) numbers[b]=0;
				ch = a; flag =1; count =0;
				
				for(int b=0; b<M; b++) {
					if(isIn(arr, ch%10)) {
						numbers[b]=ch%10; 
						ch/=10; count++;
					}
						else {
							flag = -1;
							break;
						}
				}
				
				if((flag==1)&(count==M)&(ret(numbers))) {
					for(int b=0; b<M; b++) {
						sb.append(String.valueOf(numbers[M-b-1])+" ");
					}
					sb.append("\n");
				}
				
			}
		System.out.println(sb);
	}
}

