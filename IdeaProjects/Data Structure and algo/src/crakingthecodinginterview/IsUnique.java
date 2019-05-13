package crakingthecodinginterview;

public class IsUnique {

    boolean isUniqueChars(String str){
        if(str.length() > 128){
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i=0; i<str.length(); i++){
            int val = str.charAt(i);
//            System.out.println("String value converted to int" + val);
            if(char_set[val]){
                return false;
            }
            char_set[val] =  true;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Aabcd";
        IsUnique isUnique = new IsUnique();
        boolean answer = isUnique.isUniqueChars(str);
        System.out.println(answer);
    }

}
