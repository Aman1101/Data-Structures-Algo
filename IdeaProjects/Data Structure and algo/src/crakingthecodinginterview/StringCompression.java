package crakingthecodinginterview;

public class StringCompression {

   static String compress(String s){
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i=0 ; i< s.length(); i++){
            count++;
            if (i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                builder.append(s.charAt(i));
                builder.append(count);
                count = 0;
            }
        }
        return builder.length() < s.length() ? builder.toString() : s;
    }

    public static void main(String[] args) {
        String s = "aaaabbbbbccccddAA";
        String answer = StringCompression.compress(s);
        System.out.println(answer);
    }
}
