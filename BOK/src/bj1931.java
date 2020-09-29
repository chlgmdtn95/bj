import java.util.*;
import java.io.*;
public class bj1931 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		ArrayList<Meetings> al = new ArrayList<Meetings>();
		Meetings mt;
		int finish, ret=0;
		for(int a=0; a<N; a++) {
			st = new StringTokenizer(br.readLine());
			mt = new Meetings(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			al.add(mt);
		}
		Collections.sort(al);
		finish = -1;
		for(int a=0; a<N; a++) {
			if(finish <= al.get(a).s) {
				finish = al.get(a).f;
				ret++;
			}
		}
		System.out.println(ret);
	}
	static class Meetings implements Comparable <Meetings>{
		int s; int f;
		public Meetings(int s, int f) {
			this.s = s;
			this.f = f;
		}
		
		@Override
		public int compareTo(Meetings mt) {
			if(f == mt.f)
				return s-mt.s;
			else
				return f-mt.f;
		}
		
	}
}
