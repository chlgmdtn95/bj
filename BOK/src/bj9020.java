import java.io.*;
import java.util.*;

public class bj9020 {
	static boolean isPrime(int[] prime, int a) {
		if(prime[a] ==0)
			return true;
		else
			return false;
	}
	static int findSmallerPrime(int[] prime, int a) {
		int out=0;
		for(int index=a-1 ; index>0; index--) {
			if(prime[index]==0) {
				out = index;
				break;
			}
		}
		return out;
	}
	static int findBiggerPrime(int[] prime, int a) {
		int out=0;
		for(int index=a+1 ; index<prime.length; index++) {
			if(prime[index]==0) {
				out = index;
				break;
			}
		}
		return out;
	}
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		int casenumber = Integer.parseInt(st.nextToken());
		
		int[] primenumber = new int[10001];
		for(int a=0; a<10001; a++)
			primenumber[a] = 0;
		primenumber[0]=1;
		primenumber[1]=1;
		
		for(int a=2; a<150; a++) {
			if(primenumber[a]==1)
				continue;
			for(int b=2; b<60000; b++) {
				if(a*b>=10000)
					break;
				primenumber[a*b] = 1;
			}
		}
		int obnumber =0;
		int bigg =0; int small =0;
		for(int a=0; a<casenumber ;a++) {
			st = new StringTokenizer(br.readLine());
			obnumber = Integer.parseInt(st.nextToken());
			
			if(isPrime(primenumber,obnumber/2)) 
				bw.write(String.valueOf(obnumber/2)+" "+String.valueOf(obnumber/2)+"\n");
			else {
				bigg = findBiggerPrime(primenumber,obnumber/2);
				small = findSmallerPrime(primenumber,obnumber/2);
				for(int c=0; c<10000; c++) {
					if(bigg+small == obnumber) {
						bw.write(String.valueOf(small)+" "+String.valueOf(bigg)+"\n");
						break;
					}
					else if (bigg+small > obnumber) {
						small = findSmallerPrime(primenumber,small);
					}
					else {
						bigg = findBiggerPrime(primenumber,bigg);
					}
				}
			}
			
		}
		bw.flush();
		bw.close();
	}
}
