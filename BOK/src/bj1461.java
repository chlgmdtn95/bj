import java.util.*;
import java.io.*;

public class bj1461 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int ret = 0;
		int max = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int a = 0; a < N; a++)
			al.add(Integer.parseInt(st.nextToken()));
		Collections.sort(al);

		for (int a = 0; a < N; a += C) {
			if (al.get(a) > 0)
				break;
			ret += -1 * al.get(a) * 2;
		}
		for (int a = N - 1; a >= 0; a -= C) {
			if (al.get(a) < 0)
				break;
			ret += al.get(a) * 2;
		}
		if (-1 * al.get(0) < al.get(N - 1))
			max = al.get(N - 1);
		else
			max = -1 * al.get(0);
		System.out.println(ret - max);
	}
}