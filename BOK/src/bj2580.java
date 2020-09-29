import java.util.*;
import java.io.*;

public class bj2580 {
	static int[][] table = new int[9][9];
	static int numberOfBlank;
	static int[][] blank = new int[81][2];

	static boolean ppp(int c) {
		if(c<numberOfBlank) {
			for(int a=0; a<numberOfBlank; a++) {
				for(int b=1; b<9; b++) {
					table[blank[a][0]][blank[a][1]] = b;
					if(possibleSector())
						if(impossibleRowAndColumn) {
							
						}
						}
						
				}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		numberOfBlank = 0;
		for (int a = 0; a < 9; a++) {
			st = new StringTokenizer(br.readLine());
			for (int b = 0; b < 9; b++) {
				table[a][b] = Integer.parseInt(st.nextToken());
				if (table[a][b] == 0) {
					blank[numberOfBlank][0] = a;
					blank[numberOfBlank][1] = b;
					numberOfBlank++;
				}
			}
		}
	}
}
