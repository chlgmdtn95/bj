import java.util.*;
import java.io.*;

public class bj1715{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());       
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a=0; a<N; a++)
            pq.offer(Integer.parseInt(br.readLine()));
        int ans = 0;
        int tem;
        for(int a=0; a<N-1; a++) {
            tem = pq.poll()+pq.poll();
            ans += tem;
            pq.offer(tem);
        }
        System.out.println(ans);
    }
}