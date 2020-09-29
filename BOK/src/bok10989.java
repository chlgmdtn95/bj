import java.io.*;
import java.util.*;

public class bok10989{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int inputnum = Integer.parseInt(br.readLine());
		int arr[] = new int[inputnum];
		int rear[] = new int[inputnum];
		int max =0;
		for(int a=0; a<inputnum; a++) {
			arr[a] = Integer.parseInt(br.readLine());
			if(arr[a]>=max)
				max = arr[a];
		}
		int countArray[] = new int[max];
		for(int a=0; a<max; a++)
			countArray[a] =0;
		
		for(int a=0; a<inputnum ; a++)
			countArray[arr[a]-1]++;
		for(int a=1; a<max ; a++)
			countArray[a] += countArray[a-1];
		for(int a=0; a<inputnum; a++) {
			rear[countArray[arr[inputnum-a-1]-1]-1] = arr[inputnum-a-1];
			countArray[arr[inputnum-a-1]-1]--;
		}		
		for(int a=0 ; a<inputnum ; a++)
			bw.write(String.valueOf(rear[a]) + " ");
		
		bw.flush();
		bw.close();
	}
}
