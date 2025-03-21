public class array21 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        subarray(array);

    }

    public static void subarray(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                int cursum = 0;
                for (int k = start; k <= end; k++) {
                    cursum = cursum + arr[k];
                }
                if (cursum > maxsum) {
                    maxsum = cursum;
                }
                System.out.print("__" + cursum + "__");
                System.out.println();
            }
        }
        System.out.println(maxsum);

    }
}




