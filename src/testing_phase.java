import java.util.Scanner;

public class testing_phase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversedNum = reverseNumber(num);

        System.out.println("Reversed Number: " + reversedNum);

        if (num == reversedNum) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
    /*for the input of 1000 we will get the out put as 1 but the out put should be 0001 these can be done using string
    builder that can done in future */

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

 /*for the input of 1000 we will get the out put as 1 but the out put should be 0001 these can be done using string
    builder that can done in future */
