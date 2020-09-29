import java.util.*;
import java.io.*;

public class bj11729 {
	static int[][] htower(int init, int fin, int stage, int[][] numbers) {
		if(stage ==1) {
			numbers[0][0] =1;
			numbers[0][1] =3;
			return numbers;
		}
		int pow = 1;

		numbers[0][0] = init;
		numbers[0][1] = fin;

		for (int b = 0; b < stage; b++) {
			pow *= 2;
			for (int a = 0; a <= pow / 2 - 1; a++) {
				if (numbers[a][0] == 2) {
					numbers[a][0] = 3;
					numbers[a + pow / 2 + 1][0] = 1;
				}
				else if (numbers[a][0] == 3)
					numbers[a][0] = 2;
				if (numbers[a][1] == 2) {
					numbers[a][1] = 3;
					numbers[a+pow/2+1][1] = 1;
				}
				else if (numbers[a][1] == 3)
					numbers[a][1] = 2;
			}
			numbers[pow/2][0] = 1;
			numbers[pow/2][1] = 3;
			for (int a = pow / 2 + 1; a <= pow; a++) {
				if (numbers[a][0] == 1)
					numbers[a][0] = 2;
				if (numbers[a][1] == 1)
					numbers[a][1] = 2;
			}
		}
		return htower(1,3,stage-1,numbers);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int inputnumber = sc.nextInt();
		int pow = 1;
		for (int a = 0; a < inputnumber; a++) {
			pow *= 2;
		}
		int[][] numbers = new int[pow - 1][2];
		htower(1, 3, inputnumber, numbers);

		for (int a = 0; a < pow - 1; a++)
			bw.write(String.valueOf(numbers[a][0]) + " " + String.valueOf(numbers[a][1]) + "\n");
		bw.flush();
		bw.close();
	}
}
