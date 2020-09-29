import java.util.*;
import java.io.*;

public class bj1152 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOfWord = 0;
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		while(st.hasMoreTokens()) {
			numberOfWord++;
			st.nextToken();
		}
		
		System.out.println(numberOfWord);
	}
}
