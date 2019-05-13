package CodingRound;

public class Solution {


    public int solution (String S, String T){

        int index1 = 0;
        int index2 = 0;
        if (S.length() < T.length()){
            return 0;
        }else {
            while (index1 < S.length() && index2 < T.length()) {
                if (S.charAt(index1) != T.charAt(index2)) {
                    index1++;
                }else {
                    index1++;
                    index2++;
                }

                if (index2 == T.length()){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String S = "abcccd", T = "abcd";
        Solution solution = new Solution();
        int answer = solution.solution(S, T);
        System.out.println("Answer " + answer);
    }
}
