import java.util.*;
import java.io.*;

public class bj2504 {
	static boolean er(String arr) {
		boolean eee = true;
		int app = 0;
		int bracketp = 0;
		int[] ap = new int[arr.length()];
		int[] bracket = new int[arr.length()];
		for (int a = 0; a < arr.length(); a++) {
			if (arr.charAt(a) == '[') {
				bracket[bracketp] = app;
				bracketp++;
			} else if (arr.charAt(a) == '(') {
				ap[app] = bracketp;
				app++;
			} else if (arr.charAt(a) == ')') {
				app--;
				if (app < 0)
					return false;
				else if (ap[app] != bracketp)
					return false;
			} else if (arr.charAt(a) == ']') {
				bracketp--;
				if (bracketp < 0)
					return false;
				else if (bracket[bracketp] != app)
					return false;
			}
		}
		if ((app != 0) || (bracketp != 0))
			eee = false;
		return eee;
	}

	static int app(String st) throws IOException{
		int resu = 0; StringBuilder sb = new StringBuilder();
		int app =0; int bracketp =0; int[] ap = new int[st.length()]; int[] bracket = new int[st.length()];
		for(int a=0; a<st.length(); a++) {
			if(st.charAt(a))
			
		}
		return resu;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sr = sc.nextLine();
		char[] ca = new char[sr.length()];
		for (int a = 0; a < sr.length(); a++)
			ca[a] = sr.charAt(a);
		if (er(ca))
			System.out.println("true");
		else
			System.out.println(0);

	}

}
