import java.util.*;

public class bj5598{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char cc;
        for(int a=0; a<st.length(); a++){
            if(st.charAt(a) - 3 < 'A'){
                cc = (char)('Z' - ('A' - (st.charAt(a) - 2)));
                System.out.print(cc);
            }
            else{
                cc = (char)(st.charAt(a) - 3);
                System.out.print(cc);
            }
        }
    }
}