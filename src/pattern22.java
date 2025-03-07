public class pattern22 {
    public static void main(String[] args) {
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" "); // here this is to print the void spaces which is reducing at each loop so it is 4-i which is n-i
                 }
            for (int j = 0; j <= i; j++) {//this is to print the stars which is same as outer loop i

                System.out.print("*");
            }
            System.out.println();
        }
    }
}