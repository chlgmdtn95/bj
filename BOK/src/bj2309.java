import java.util.*;

public class bj2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[] = new int[9];
		int dev;
		for (int a = 0; a < 9; a++) {
			arr[a] = sc.nextInt();
			sum += arr[a];
		}
		dev = sum - 100;

		for (int a = 0; a < 7; a++) {
			for (int b = a + 1; b < 8; b++) {
				if (arr[a] + arr[b] == dev) {
					arr[a] = -1;
					arr[b] = -1;
				}
			}

		}
		Arrays.sort(arr);
		for (int a = 2; a < 9; a++)
			System.out.println(arr[a]);
	}
}