public class avgof3 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=10;
        int z=avg(a,b,c);
        System.out.println(z);
    }

    private static int avg(int a, int b, int c) {
        int o=(a+b+c)/3;
        return o;
    }
}