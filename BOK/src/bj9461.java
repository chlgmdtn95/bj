import java.util.*;
import java.io.*;
public class bj9461 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int casenumber = Integer.parseInt(br.readLine());
		long[] arr = new long[101];
		arr[1] = 1; arr[2] = 1; arr[3] = 1; arr[4] = 2; arr[5] = 2;
		for(int a=6; a<101; a++)
			arr[a] = arr[a-1]+arr[a-5];		
		for(int a=0; a<casenumber; a++) {
			sb.append(arr[Integer.parseInt(br.readLine())]+"\n");
		}
		System.out.println(sb);
	}
}
