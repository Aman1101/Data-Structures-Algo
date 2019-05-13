package Euclid;

public class BubbleSort {

    public static void bubbleSort(int []array){
        for (int i=array.length; i>0; i--){
            for(int j= 0; j<i-1; j++){
                if(array[j]>array[j+1]){
                    swapNumbers(j, j+1, array);
                }
            }
            printNumbers(array);
        }

    }
    private  static void swapNumbers(int i, int j, int[]array){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void printNumbers(int[]array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int [] numbers= {4, 2, 9, 6, 23, 12, 34, 0, 1};
        bubbleSort(numbers);
    }
}
