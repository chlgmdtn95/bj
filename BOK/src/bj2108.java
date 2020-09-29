import java.util.*;
import java.io.*;

public class bj2108 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casenumber = Integer.parseInt(br.readLine());
		int[] cases = new int[casenumber];
		
		for(int a=0; a<casenumber; a++) {
			cases[a] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(cases);
		
		double sum=0; int max = cases[0]; int count =0; int countmax =0; int max2= max;
		
		for(int a=casenumber-1; a>=0; a--) {
			sum += cases[a];
			if(a!=casenumber-1)
				if(cases[a]!=cases[a+1]) {
				count =0;
			}
			count++;
			if(countmax<=count) {
				countmax=count; max2= max; max = cases[a];
			}
		}
				
		
		System.out.println(Math.round(sum/casenumber));
		System.out.println(cases[casenumber/2]);
		System.out.println(max2);
		System.out.println(cases[casenumber-1]-cases[0]);
	}
}
