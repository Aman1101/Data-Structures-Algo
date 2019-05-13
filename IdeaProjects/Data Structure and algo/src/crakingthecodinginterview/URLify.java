package crakingthecodinginterview;

public class URLify {

    public static String replace (String s){
        char temp = 'j';
        StringBuilder t = new StringBuilder(s);
        for(int i = s.length()-1 ; i >=0; i--) {
            if (s.charAt(i) == ' '){
            //ask Vaibhav
                t.setCharAt(i, temp);
            }
        }
        return t.toString();
    }

    public static void main(String[] args) {
        String s = "as as";
        String answer = URLify.replace(s);
        System.out.println(answer);
    }

}
