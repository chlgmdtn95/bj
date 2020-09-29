import java.util.*;
import java.io.*;
public class bj1874 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		int max=0; int number;
		for(int a=0; a<N; a++) {
			number = Integer.parseInt(br.readLine());
			if(number > max) {
				for(int b=max+1; b<=number; b++) {
					stack.push(b);
					sb.append("+\n");
				}
			max = number;
			}
			else if (number != (Integer)stack.peek()) {
				System.out.println("NO");
				return;
			}
			sb.append("-\n");
			stack.pop();
		}
		System.out.println(sb);
	}
}
