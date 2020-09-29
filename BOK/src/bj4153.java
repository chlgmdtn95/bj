import java.util.*;
import java.io.*;

public class bj4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		;

		int[] a = new int[3];
		for (int e = 0; e < 3; e++)
			a[e] = Integer.parseInt(st.nextToken());

		while (a[0] != 0) {
			Arrays.sort(a);

			if (a[0] * a[0] + a[1] * a[1] == a[2] * a[2])
				bw.write("right\n");
			else
				bw.write("wrong\n");

			st = new StringTokenizer(br.readLine());
			for (int e = 0; e < 3; e++)
				a[e] = Integer.parseInt(st.nextToken());
		}
		bw.flush();
		bw.close();
	}
}
