package crakingthecodinginterview;

import java.util.Arrays;

public class IsUniqueWithSorting {

    boolean isUniqueChars(String str) {

        char charArray[] = str.toCharArray();

        Arrays.sort(charArray);

        for (int i = 0; i< charArray.length-1; i++){
            if(charArray[i]!=charArray[++i]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Aabcd a";
        IsUniqueWithSorting isUniqueWithSorting = new IsUniqueWithSorting();
        System.out.println(isUniqueWithSorting.isUniqueChars(str));
    }
}
