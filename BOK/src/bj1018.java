import java.io.*;
import java.util.*;

public class bj1018 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int height = Integer.parseInt(st.nextToken()); int width = Integer.parseInt(st.nextToken());
		String[] startwhite = new String[8]; String[] startblack = new String[8];
		startwhite[0] = startwhite[2]= startwhite[4]= startwhite[6]= "WBWBWBWB";startwhite[1]=startwhite[3]=startwhite[5]=startwhite[7]="BWBWBWBW";
		startblack[1] = startblack[3]= startblack[5]= startblack[7]= "WBWBWBWB";startblack[0]=startblack[2]=startblack[4]=startblack[6]="BWBWBWBW";
		String[] inputarr = new String[height];
		
		for(int a=0; a<height; a++) {
			inputarr[a] = br.readLine();
		}
		  
		int min = 64; int countW; int countB;
		
		loop:
		for(int a=0; a<height-7; a++)
			for(int b=0; b<width-7; b++) {
				countW =0; countB=0;
				
				for(int c =0; c<8; c++) {
					for(int d=0; d<8; d++) {
						if(inputarr[a+c].charAt(b+d) != startwhite[c].charAt(d))
							countW++;
						if(inputarr[a+c].charAt(b+d) != startblack[c].charAt(d))
							countB++;
					}
				}
				if(min>Math.min(countW, countB))
					min = Math.min(countW,  countB);
				if(min == 0)
					break loop;				
			}
		
		System.out.println(min);
	}
}
