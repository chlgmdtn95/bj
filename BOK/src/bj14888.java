import java.util.*;

public class bj14888 {
	static int[] op = new int[4];
	static int[] num;
	static int[] ops;
	static int len;
	static int max = -1000000000;
	static int min = 1000000000;
	static int result;

	static int operate(int a, int b, int c) {
		switch (c) {
		case 0:
			return a + b;
		case 1:
			return a - b;
		case 2:
			return a * b;
		case 3:
			return a / b;
		}
		return 0;
	}

	static void per(int a, int[] visit) {
		int[] tvisit = new int[4];
		if (a > len - 2) {
			result = num[0];
			for (int b = 0; b < len - 1; b++) {
				result = operate(result, num[b + 1], ops[b]);
			}
			if (result > max)
				max = result;
			if (result < min)
				min = result;
			return;
		}		
		for (int i = 0; i < 4; i++) {
			for (int z = 0; z < 4; z++)
				tvisit[z] = visit[z];			
			if (tvisit[i] != 0) {				
				ops[a] = i;
				tvisit[i]--;
				per(a + 1, tvisit);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		num = new int[len];
		ops = new int[len - 1];
		for (int a = 0; a < len; a++)
			num[a] = sc.nextInt();
		for (int a = 0; a < 4; a++)
			op[a] = sc.nextInt();
		per(0, op);
		System.out.println(max + "\n" + min);
	}
}
