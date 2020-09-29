import java.io.*;
import java.util.*;

public class bok2751 {
	static void changeArray(int ar[], int a, int b ) {
		int buf = 0;
		buf = ar[a];
		ar[a] = ar[b];
		ar[b] = buf;
	}
	
	static void heapMaking(int ar[], int address) {
		if(address == 0 ) {
			return;
		}
		else {
			if(ar[address]>ar[(address-1)/2]) {
				changeArray(ar,address, (address-1)/2);
				heapMaking(ar,(address-1)/2);
			}
		}
	}
	
	static void downShift(int ar[], int arLeng, int address) {
		if((address+1)*2 >= arLeng) {
			if((address+1)*2-1 >= arLeng)
				return;
			else
				if(ar[address]<=ar[(address+1)*2-1]) {
					changeArray(ar, address,(address+1)*2-1 );
					return;
				}
		}
		else {
			if(ar[(address+1)*2]<=ar[(address+1)*2-1]) {
				if(ar[address]<=ar[(address+1)*2-1]) {
					changeArray(ar, address,(address+1)*2-1 );
					downShift(ar, arLeng,(address+1)*2-1 );
				}
				else
					return;
			}
			else {
				if(ar[address]<=ar[(address+1)*2]) {
					changeArray(ar, address,(address+1)*2 );
					downShift(ar, arLeng,(address+1)*2);
				}
				else
					return;
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputnum = Integer.parseInt(br.readLine());
		int arr[] = new int[inputnum];
		
		for(int a =0; a< inputnum; a++) {
			arr[a] = Integer.parseInt(br.readLine());
		}
		for(int a=0; a<inputnum ; a++) {
			heapMaking(arr, a);
		}
	/*	for(int a=1; a<inputnum; a++) {
			changeArray(arr, 0, inputnum-a);
			heapMaking(arr, inputnum-a);   
		}  */
		for(int a=0; a<inputnum; a++) {
			downShift(arr,inputnum-a, 0);
			changeArray(arr,0,inputnum-a-1); 
		}				
		for(int a=0 ; a<inputnum ; a++) {
			bw.write(String.valueOf(arr[a])+" ");
		}
		
		bw.flush();
		bw.close();
	}
}
