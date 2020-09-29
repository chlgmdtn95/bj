import java.util.*;
public class bj1212{
    static String con(char a){
        if(a=='0')
            return "000";
        else if(a=='1')
            return "001";
        else if(a=='2')
            return "010";
        else if(a=='3')
            return "011";
        else if(a=='4')
            return "100";
        else if(a=='5')
            return "101";
        else if(a=='6')
            return "110";
        else
            return "111";
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String b = sc.nextLine();
        for(int a=0; a<b.length(); a++){
            sb.append(con(b.charAt(a)));
        }
        System.out.println(sb);
    }
}