import java.util.Scanner;

public class bj1463 {
	static int min2(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	static int min3(int a, int b, int c) {
		if (a <= b & a <= c)
			return a;
		else if (b <= a & b <= c)
			return b;
		else if (c <= a & c <= b)
			return c;
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inn = sc.nextInt();
		int[] arr = new int[inn+1];
		arr[1] = 0;
		for (int a = 2; a < inn + 1; a++) {
			if (a % 2 == 0 & a % 3 == 0)
				arr[a] = min3(arr[a - 1], arr[a / 2], arr[a / 3]) + 1;
			else if (a % 2 == 0)
				arr[a] = min2(arr[a - 1], arr[a / 2]) + 1;
			else if (a % 3 == 0)
				arr[a] = min2(arr[a - 1], arr[a / 3]) + 1;
			else
				arr[a] = arr[a - 1] + 1;
		}
		System.out.println(arr[inn]);
	}
}
