import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        boolean prime =true;
        for(int i=2;i<=Math.sqrt(n);i++){//for optimisation of the code we used root n instead of n 
            if(n%i==0){
                prime=false;
            }
        }
        System.out.println(prime);
    }
}
