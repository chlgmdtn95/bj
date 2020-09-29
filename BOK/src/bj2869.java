import java.io.*;
import java.util.Scanner;

public class bj2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int result;
		if((v-a)%(a-b)==0)
			result = ((v-a)/(a-b)+1);
		else
			result = ((v-a)/(a-b)+2);
		
		System.out.println(result);
	}

}
