import java.io.*;
import java.util.*;

public class bj10818 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int casenumber = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		int min = max;
		int compare;
		for(int a=1 ; a<casenumber ; a++) {
			compare = Integer.parseInt(st.nextToken());
			if (max < compare)
				max = compare;
			if (min > compare)
				min = compare;
		}
		
		bw.write(String.valueOf(min)+" "+String.valueOf(max));
		bw.flush();
		bw.close();
	}
}
