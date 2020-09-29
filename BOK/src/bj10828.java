import java.io.*;
import java.util.*;
public class bj10828 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Stack stack = new Stack();
		String s; int size = 0;
		for(int a=0; a<N; a++) {
			st = new StringTokenizer(br.readLine());
			s = st.nextToken();
			switch(s) {
				case "push" :
					stack.push(Integer.parseInt(st.nextToken()));
					size ++;
					break;
				case "pop" :
					if(size > 0) {
						sb.append(stack.pop()+"\n");
						size--;
					}
					else {
						sb.append(-1 +"\n");
						size = 0;
					}
					break;
				case "size" :
					sb.append(size+"\n");
					break;
				case "empty" :
					if(stack.empty())
						sb.append(1+"\n");
					else
						sb.append(0+"\n");
					break;
				case "top" :
					if(size>0)
						sb.append(stack.peek()+"\n");
					else
						sb.append(-1+"\n");
					break;
			}			
		}
		System.out.println(sb);
	}
}
