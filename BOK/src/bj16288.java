import java.io.*;
import java.util.*;

public class bj16288 {
	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int saram = Integer.parseInt(st.nextToken());
	int desk = Integer.parseInt(st.nextToken());
	int de[][] = new int[desk][100];
	for(int a=0; a<desk ;a++)
		for(int b=0; b<100 ; b++)
			de[a][b] = 0;
	int c;
	boolean tt = false;
	
	st= new StringTokenizer(br.readLine());
	
	for(int a=1; a<saram ; a++) {
		tt=false;
		c=Integer.parseInt(st.nextToken());
		for(int b=0; b<desk; b++){
			if(c == de[b][a]) {
				tt=true;
				if(a<=saram-desk)
					de[b][a] += 1;
				break;
			}
		}
		if(tt==false)
			break;
		
	}
	
	if(tt==true)
		bw.write("YES");
	else
		bw.write("NO");
	
	bw.flush();
	bw.close();
	
	}
}
