import java.util.*;
import java.io.*;

public class bj1276 {
	static class Bridges implements Comparable<Bridges> {
		int x1, x2, y;

		public Bridges(int y, int x1, int x2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y = y;
		}

		@Override
		public int compareTo(Bridges br) {
			if (br.y == this.y) {
				if (br.x1 == this.x1)
					return br.x2 - this.x2;
				else
					return br.x1 - this.x1;
			} else
				return br.y - this.y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		ArrayList<Bridges> al = new ArrayList<Bridges>();
		Bridges bridge;
		boolean boo1, boo2;
		for (int a = 0; a < N; a++) {
			st = new StringTokenizer(br.readLine());
			bridge = new Bridges(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()));
			al.add(bridge);
		}
		Collections.sort(al);
		int ret = 0;
		for (int a = 0; a < N; a++) {
			boo1 = false;
			boo2 = false;
			for (int b = a + 1; b < N; b++) {
				if (boo1 == false) {
					if (al.get(a).x1 >= al.get(b).x1 & al.get(a).x1 < al.get(b).x2) {
						boo1 = true;
						ret += al.get(a).y - al.get(b).y;
					}
				}
				if (boo2 == false) {
					if (al.get(a).x2 > al.get(b).x1 & al.get(a).x2 <= al.get(b).x2) {
						boo2 = true;
						ret += al.get(a).y - al.get(b).y;
					}
				}
				if (boo1 == true & boo2 == true)
					break;
			}
			if (boo1 == false)
				ret += al.get(a).y;
			if (boo2 == false)
				ret += al.get(a).y;
		}
		System.out.println(ret);
	}
}
