import java.util.*;
import java.io.*;

public class bj10258 {
	static int arr[] = new int[31];

	static long getAns(String in) {
		int length = in.length();
		long ans = 0;
		boolean tem = false;
		for (int i = 0; i < length; i++) {
			if (tem == false & in.charAt(i) == '1') {
				tem = true;
				if(i == length-1)
					ans+=1;
			}
			else if(tem == true & in.charAt(i) == '1') {
				ans += arr[length - 1 - i] + 1;
				tem = false;
			}
			else if(tem == true & in.charAt(i) == '0') {
				if(length-2-i <0) {
					ans+=1; 
				}
				ans += arr[length - 2 - i] + 1;
			}			
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		arr[0] = 1;
		arr[1] = 3;
		for (int i = 2; i < 31; i++)
			arr[i] = arr[i - 1] * 2 + 1;
		
		for (int i = 0; i < N; i++) {
			sb.append(getAns(br.readLine())+"\n");
		}
		System.out.println(sb);
	}
}
