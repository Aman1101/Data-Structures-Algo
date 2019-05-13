package crakingthecodinginterview.dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TripleStep {

    int countWays(int n){
        int [] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return countWaysUtil(n, memo);
    }

    int countWaysUtil(int n, int [] memo){
        if (n<0){
            return 0;
        }else if(n == 0){
            return 1;
        }else if (memo[n] > -1){
            return memo[n];
        }else {
            memo[n] = countWaysUtil(n-1, memo) + countWaysUtil(n-2, memo) + countWaysUtil(n-3, memo);
            return memo[n];
        }
    }

    public static void main(String[] args) {
        int n = 3;

        TripleStep t = new TripleStep();
        System.out.printf(""+ t.countWays(n));
    }

}
