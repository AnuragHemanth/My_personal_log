import java.math.*;
public class dectobin {
    public static void main(String[] args) {
        int dec = dectobinary(5);
        System.out.println(dec);
    }
        public static int dectobinary ( int n){
        int bin=0;
        int power = 0;
            while (n > 0) {
                int rem = n % 2;
                bin = (int) (bin + (rem * (Math.pow(10, power))));//feeding the value for remender to 1 and 10s place
                n = n / 2;//20min to perform this task
                power++;
            }
            return bin;
        }
    }
