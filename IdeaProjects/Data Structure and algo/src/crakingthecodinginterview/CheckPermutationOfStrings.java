package crakingthecodinginterview;

public class CheckPermutationOfStrings {

    boolean permutation (String s, String t){
        if(s.length() != t.length()) return false;

        int [] letters = new int[128];
        //int count =0;
        /*char [] s_array = s.toCharArray();
        for (char c : s_array){
            count++;
            letters[c] = count;
        }*/
        for(int i =0; i < s.length(); i++) {
            int c = s.charAt(i);
            letters[c]++;
        }

        for (int i =0; i < t.length(); i++){
            int c = t.charAt(i);
//            System.out.println(c);
            letters[c]--;

            if (letters[c]<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abgcdg", t = "dbacga";
        CheckPermutationOfStrings checkPermutationOfStrings = new CheckPermutationOfStrings();
        boolean answer = checkPermutationOfStrings.permutation(s, t);
        System.out.println(answer);
    }
}
