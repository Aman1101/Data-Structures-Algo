package crakingthecodinginterview;

public class StringRotation {

    boolean isRotation(String s1, String s2){

        if (s1.length() == s2.length() && s1.length() >0){

            s1 = s1 + s1;
            return isSubstring(s1, s2);
        }
        return false;
    }

    boolean isSubstring(String s1, String s2){
        if (s1.contains(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "AMAN", s2 = "MANA";
        StringRotation rotation = new StringRotation();
        System.out.println("Answer : " + rotation.isRotation(s1, s2) );
    }
}
