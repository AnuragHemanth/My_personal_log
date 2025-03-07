import java.util.*;
public class Main{
    public static void main(String[] args) {
        int n ;
        int esum =0;
        int osum =0;
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        while(n>0) {
            System.out.println("enter the input number one by one");
            int num =sc.nextInt();
            if(num%2==0){
                esum+=num;
        }
            else{
                osum+=num;

            }
            n--;
        }
        System.out.println("even sum"+ esum);
        System.out.println("odd sum"+ osum);

    }
}
