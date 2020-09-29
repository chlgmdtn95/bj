import java.util.*;
import java.io.*;

public class bj4949 {
	static boolean er(String arr) {
		boolean eee = true;
		int app=0; int bracketp =0; char t;
		int[] ap = new int[arr.length()]; int[] bracket = new int[arr.length()];
		for(int a=0; a<arr.length(); a++) {
			t = arr.charAt(a);
			if(t=='[') {
				bracket[bracketp]=app;
				bracketp++;
			}
			else if(t=='(') {
				ap[app]=bracketp;
				app++;
			}
			else if(t==')') {
				app--;
				if(app<0)
					return false;
				else
					if(ap[app]!=bracketp)
						return false;
			}
			else if(t==']') {
				bracketp--;
				if(bracketp<0)
					return false;
				else
					if(bracket[bracketp]!=app)
						return false;
			}
		}
		if((app!=0)||(bracketp!=0))
			eee=false;
		return eee;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a=0; String s;
		while(a==0) {
			s=br.readLine();
			if((s.length()==1)&(s.charAt(0)=='.'))
				break;
			if(er(s))
				sb.append("yes"+"\n");
			else
				sb.append("no"+"\n");
		}
		System.out.println(sb);
	}
}
