import java.io.*;
import java.util.*;

public class bj2798 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cardnum = Integer.parseInt(st.nextToken()); int max = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int[] cards = new int[cardnum];
		
		for(int a=0; a<cardnum; a++)
			cards[a] = Integer.parseInt(st.nextToken());

		Arrays.sort(cards);
		int[] cardarr = new int[3];
		
		int min = max - cards[0] - cards[1] - cards[2];
		cardarr[0]=cards[0] ;cardarr[1]= cards[1] ;cardarr[2]=cards[2];
		
		for(int a=0; a<cardnum; a++) 
			for(int b=a+1; b<cardnum; b++)
				for(int c = b+1; c<cardnum; c++)
					if((cards[a]+cards[b]+cards[c]<=max)&(max-cards[a]-cards[b]-cards[c] < min)) {
							cardarr[0]=cards[a];cardarr[1]=cards[b];cardarr[2]=cards[c];
							min = max-cards[a]-cards[b]-cards[c];
					}
		
		System.out.println(cardarr[0]+cardarr[1]+cardarr[2]);
	}
}
