import java.io.*;
import java.util.*;

public class bj11729B {
	static int[][] htower(int init, int terminal, int stage, int[][] numbers){
		int pow=1;
		if(stage==1) {
			numbers[0][0] = 1;
			numbers[0][1] = 3;
			return numbers;
		}
		else {
			numbers = htower(1,3,stage-1,numbers);
			for(int a=0; a<stage-1 ;a++) {
				pow *=2;
			}
			numbers[pow-1][0]=1; numbers[pow-1][1] =3;
			for(int a=0; a<pow-1; a++) {
				for(int b=0; b<2; b++) {
					if(numbers[a][b]==3) {
						numbers[a][b]=2;
						numbers[a+pow][b]=3;
					}
					else if (numbers[a][b]==2) {
						numbers[a][b]=3;
						numbers[a+pow][b]=1;
					}
					else {
						numbers[a+pow][b]=2;
					}
				}
			}
			return numbers;
		}
	}
	
	public static void main(String[] args)throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int pow =1; int inputnumber = sc.nextInt();
		for(int a=0; a<inputnumber; a++)
			pow *= 2;
		int[][] numbers = new int[pow-1][2];
		numbers = htower(1,3,inputnumber,numbers);
		
		bw.write(pow-1+"\n");
		for (int a = 0; a < pow - 1; a++)
			bw.write(String.valueOf(numbers[a][0]) + " " + String.valueOf(numbers[a][1]) + "\n");
		bw.flush();
		bw.close();
	}
}
