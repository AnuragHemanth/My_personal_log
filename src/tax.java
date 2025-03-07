import java.util.*;
public class tax {
    public static void main(String[] args) {
        int income ;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the income ");
        income =sc.nextInt();
        if(income<500000){
            System.out.println(income);}
        else if( income>=500000 && income<=1000000 ){
            System.out.println(income*1.2);
        }
        else{
            System.out.println(income*1.3);
        }
    }}
