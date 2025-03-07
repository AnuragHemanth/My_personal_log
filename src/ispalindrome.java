public class ispalindrome {
    public static void main(String[] args) {
        int b=1253;
        int z=rev(b);
        if(z==b){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    public static int rev(int n) {
        int rev = 0;
        for (int a = n; a > 0; a /= 10) {
            rev = (rev * 10) + (a % 10);
        }
        return rev;
    }

}
