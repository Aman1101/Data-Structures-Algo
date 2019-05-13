// program to

public class Solution {

    public static int[] compare(int[] arr, int k){
        int start = arr.length - k;
        int end = start - 1;

        if(k > arr.length) return arr;

        while(end >= 0) {
            start = returnLarger(arr, start, end, k);
            end = end - 1;
        }
        int[] output = new int[k];
        for(int i = 0; i < k; i++) {
            output[i] = arr[start++];
        }
        return output;
    }

    public static int returnLarger(int[] arr, int start, int end, int k){
        for(int i = start, j = end, count = 0; count < k; count++) {
            if(arr[i] > arr[j]) {
                return start;
            } else if(arr[i] < arr[j]) {
                return end;
            } else {
                i++;
                j++;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int A[] = {1,4,3,4,5};
        int k=2;
        int B[] = new int[k];
        B = Solution.compare(A, k);

        for (int i=0; i< B.length; i++){
            System.out.println(B[i]);
        }
    }
}
