import java.util.*;
import java.io.*;

public class bj1181 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int casenumber = Integer.parseInt(br.readLine());
		String[] ass = new String[casenumber];
		for(int a=0; a<casenumber; a++) {
			ass[a] = br.readLine();
		}
		Arrays.sort(ass, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return o1.length()-o2.length();
			}
		});
		bw.write(ass[0]+"\n");
		for(int a=1; a<casenumber; a++) {
			if(ass[a].equals(ass[a-1]))
				continue;
			else
				bw.write(ass[a]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
