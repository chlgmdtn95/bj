import java.io.*;
import java.util.*;

public class bj1002 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int casenumber=Integer.parseInt(st.nextToken());
		int[] argue=new int[6];
		double[] leng=new double[3];
		for(int a=0; a<casenumber; a++) {
			st=new StringTokenizer(br.readLine());
			for(int b=0; b<6; b++)
				argue[b]=Integer.parseInt(st.nextToken());
			if((argue[0]==argue[3])&(argue[1]==argue[4])&(argue[2]==argue[5])) {
				bw.write(String.valueOf(-1)+"\n");
				continue;
			}
			leng[0]=argue[2]; leng[1]=argue[5];
			leng[2] = Math.sqrt((argue[0]-argue[3])*(argue[0]-argue[3])+(argue[1]-argue[4])*(argue[1]-argue[4]));
			
			Arrays.sort(leng);
			if(leng[0]+leng[1]==leng[2])
				if(leng[0]==0)
					bw.write(String.valueOf(-1)+"\n");
				else			
					bw.write(String.valueOf(1)+"\n");
			else if (leng[0]+leng[1]>leng[2])
				bw.write(String.valueOf(2)+"\n");
			else
				bw.write(String.valueOf(0)+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
