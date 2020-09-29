import java.util.*;
import java.io.*;

public class bj10814 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int casenumber = Integer.parseInt(st.nextToken());
		String[][] cc = new String[casenumber][3];
		for(int a=0; a<casenumber; a++) {
			st = new StringTokenizer(br.readLine());
			cc[a][0] = st.nextToken();
			cc[a][1] = st.nextToken();
			cc[a][2] = String.valueOf(a);
		}
		
		Arrays.sort(cc, new Comparator <String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[0])==Integer.parseInt(o2[0]))
					return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
				else
					return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
		});
		
		for(int a=0; a<casenumber; a++) {
			bw.write(cc[a][0]+" "+cc[a][1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
