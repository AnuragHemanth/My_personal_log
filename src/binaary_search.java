public class binaary_search {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 6;
        int res = cn(numbers, key);
        System.out.println(res);
    }
        public static int cn( int[] numbers, int key) {
            int start = 0;
            int end = numbers.length - 1;
            while (start <= end) {
                int mid = end - start / 2;
                if (numbers[mid] == key) {
                    return mid;
                }

                if (numbers[mid] < key) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }


            }return -1;

        }

    }