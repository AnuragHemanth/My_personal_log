public class swapping {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 4, 2, 3};
        swap(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
        public static void swap(int[]  arr){
            int start=0,end= arr.length-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }
