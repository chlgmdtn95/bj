import java.util.*;

public class bj9252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int memo[][] = new int[a.length()+1][b.length()+1];
		
		for(int i = 1; i<a.length()+1; i++) {
			for(int j = 1; j<b.length()+1; j++) {
				if(a.charAt(i-1) == b.charAt(j-1))
					memo[i][j] = memo[i-1][j-1] + 1;
				else
					memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
			}
		}
		for(int i = 0; i<a.length()+1; i++) {
			for(int j = 0; j<b.length()+1; j++)
				System.out.print(memo[i][j]+" ");
			System.out.println();
		}
		
		int i = a.length();
	    int j = b.length();
	    char ans[] = new char[memo[a.length()][b.length()]];
	    int index = 0;
	    
	    while (memo[i][j] != 0) {
	        if (memo[i][j] == memo[i - 1][j] ) {
	            i--;
	        }
	        else if(memo[i][j] == memo[i][j-1]){
	            j--;
	        }
	        else {
	            ans[index] = a.charAt(i-1);
	            i--;
	            j--;
	            index ++;
	        }
	    }
	    
	    for(int p=memo[a.length()][b.length()]-1; p>=0; p-- )
	    	sb.append(ans[p]);

		System.out.println(memo[a.length()][b.length()]);
		System.out.println(sb);
	}
}
