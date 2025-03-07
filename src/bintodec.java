import java.util.*;
import java.math.*;
public class bintodec {
    public static void main(String[] args) {
        int n=1011;
        int m=bin(n);
        System.out.println(m);
    }
    public static int bin(int n)
    {
        int pow=0;
        int dec=0;

        while (n>0){
            int lastdigit=n%10;
            dec=dec+lastdigit*(int)Math.pow(2,pow);
            n=n/10;
            pow++;
            }
        return dec;
    }
}
