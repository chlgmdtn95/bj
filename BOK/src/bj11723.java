import java.util.*;
import java.io.*;

public class bj11723{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int casenumber = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int bit = 0;
        String string;
        int pr;
        for(int a=0; a<casenumber; a++){
            st = new StringTokenizer(br.readLine());
            string = st.nextToken();
            if(string.equals("all")) { 
            	bit = (1<<20)-1;
            	continue;
            }
            if(string.equals("empty")) {
            	bit = 0;
            	continue;
            }
            pr = Integer.parseInt(st.nextToken())-1;
            if(string.equals("add"))
                bit = bit|(1<<pr);
            else if (string.equals("remove"))
                bit = bit&(~(1<<pr));
            else if (string.equals("check")){
                if((bit&(1<<pr))>0) sb.append(1+"\n");
                else sb.append(0+"\n");
            }                
            else if (string.equals("toggle"))
                bit = bit^(1<<pr);
        }
        System.out.println(sb);
    }
}