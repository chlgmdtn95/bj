import java.util.*;

public class bj1697{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[100001];
        for(int a=0; a<100001; a++)
            arr[a] = 0;
        q.offer(N);
        int tem;
        while(!q.isEmpty()){
            tem = q.poll();
            if(tem < 100000)
                if(arr[tem+1] == 0){
                    arr[tem+1] = arr[tem]+1;
                    q.offer(tem+1);
                }
            if(tem>0)
                if(arr[tem-1] == 0){
                    arr[tem-1] = arr[tem]+1;
                    q.offer(tem-1);
                }
            if(tem*2 < 100001)
                if(arr[tem*2] == 0){
                    arr[tem*2] = arr[tem]+1;
                    q.offer(tem*2);
                }
            if(arr[K] != 0)
                break;
        }
        arr[N] = 0;
        System.out.println(arr[K]);
    }
}