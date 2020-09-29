import java.util.*;
import java.io.*;

public class bj2098{
    static int N, ans, next;
    static int arr[][];
    static int memo[][];
    static int INF = 2000000000;

    static void dfs(int index, int visit){
        System.out.println("DFS "+index+" "+visit);
        for(int a=0; a<N; a++){
        	next = visit|(1<<a);
            if(memo[a][next] != INF) {System.out.println(1+" "+a); continue;}
            if((visit&(1<<a)) != 0 || arr[index][a] == 0) {System.out.println(2+" "+a); continue;}
            memo[a][visit|(1<<a)] =  memo[index][visit] + arr[index][a];
            dfs(a,next);
        }
        
        if(visit == (1<<N)-1){
        	System.out.println("check");
            if(arr[index][0] == 0)
                return;
            ans = Math.min(ans, memo[index][visit] + arr[index][0]);
        }
    }
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        memo = new int[N][(1<<N)];
        ans = INF;
        for(int a=0; a<N; a++)
            for(int b=0; b<((1<<N)-1); b++)
                memo[a][b] = INF;
        for(int a=0; a<N; a++){
            st = new StringTokenizer(br.readLine());
            for(int b=0; b<N; b++)
                arr[a][b] = Integer.parseInt(st.nextToken());
        }
        memo[0][1] = 0;
        dfs(0,1);

        for(int a=0; a<N; a++) {
            for(int b=0; b<((1<<N)-1); b++)
                System.out.print(memo[a][b] +" ");
            System.out.println();
        }
        System.out.println(ans);
    }
}
