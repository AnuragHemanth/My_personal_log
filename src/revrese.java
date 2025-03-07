public class revrese {
    public static void main(String[] args) {
        int rev=0;
        for (int n=10890; n>0;n=n/10 ){
            rev=(10*rev)+n%10;
        }
        System.out.println(rev);
    }


}
