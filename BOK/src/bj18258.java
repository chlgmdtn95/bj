import java.util.*;
import java.io.*;

public class bj18258{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N =  Integer.parseInt(br.readLine());
        StringTokenizer st;
        String instruct;
        Queue<Integer> q = new LinkedList<>();
        int rear = 0;
        
        for(int a=0; a<N; a++){
            st = new StringTokenizer(br.readLine());
            instruct = st.nextToken();
            
            switch(instruct){
                case "push" :
                    rear = Integer.parseInt(st.nextToken());
                    q.offer(rear);
                    break;
                case "pop" :
                    sb.append(q.poll()+"\n");
                    break;
                case "size" :
                    sb.append(q.size()+"\n");
                    break;
                case "empty" :
                    if(q.isEmpty())
                        sb.append(1+"\n");
                    else
                        sb.append(0+"\n");
                    break;
                case "front" :
                    if(q.isEmpty())
                        sb.append(-1+"\n");
                    else
                        sb.append(q.peek()+"\n");
                    break;
                case "back" :
                    if(q.isEmpty())
                        sb.append(-1+"\n");
                    else
                        sb.append(rear+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}