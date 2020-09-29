import java.util.*;
import java.math.*;

public class bj1271{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger(); BigInteger m = sc.nextBigInteger();
        BigInteger[] tem = n.divideAndRemainder(m);
        System.out.println(n.subtract(tem[1]).divide(m));
        System.out.println(tem[1]);
    }
}