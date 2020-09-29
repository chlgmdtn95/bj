import java.util.*;
import java.io.*;

public class bj2447 {
	static void printing(char[][] arr, int num, int x, int y)throws IOException{
		if(num==3) {
			for(int a=0; a<3; a++)
				for(int b=0; b<3; b++)
					arr[x+a][y+b]='*';
			arr[x+1][y+1]=' ';
			return;
		}
		else{
			for(int a=0; a<3; a++)
				for(int b=0; b<3; b++) {
					if((a==1)&(b==1))
						continue;
					printing(arr,num/3,x+a*num/3,y+b*num/3);
				}
		}
	}
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int in = sc.nextInt();
		char[][] arr = new char[in][in];
		
		for(int a=0; a<in; a++)
			for(int b=0; b<in; b++)
				arr[a][b]=' ';
		
		printing(arr, in, 0, 0);
		for(int a=0; a<in; a++)
			for(int b=0; b<in; b++)
				if((b%in==0)&(a!=0))
					bw.write("\n"+ arr[a][b]);
				else
					bw.write(arr[a][b]);
		bw.flush();
		bw.close();
	}
}