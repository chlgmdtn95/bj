import java.util.*;
import java.io.*;

public class bj20046 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[m][n];
		int ans[][] = new int[m+1][n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) 
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				
			}
		}
	}
}
