package crakingthecodinginterview;

public class OneAway {

    public boolean  check(String firstString, String secondString){


        if (firstString.length() == secondString.length()){
            return replace(firstString, secondString);
        }else if(firstString.length() ==  secondString.length()-1){
            return insertOrDelete(firstString, secondString);
        }else if (firstString.length() == secondString.length()+1){
            return insertOrDelete(secondString, firstString);
        }
    return false;
    }

    boolean replace (String firstString, String secondString){
        int count =0;
        for (int i = firstString.length()-1; i >=0; i--){
            if(firstString.charAt(i) != secondString.charAt(i)){
                count++;
            }
        }
        if(count == 1){
            return true;
        }else {
            return false;
        }
    }

    boolean insertOrDelete(String firstString, String secondString){
        int index1 = 0;
        int index2 = 0;
//        int count = 0;
        while (index1 < firstString.length() && index2 < secondString.length()) {

            if (firstString.charAt(index1) != secondString.charAt(index2)){
                if (index1 != index2){
                    return false;
                }
                index2++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "PALE", s2 = "PLE";
        OneAway oneAway = new OneAway();
        boolean answer = oneAway.check(s1, s2);
        System.out.println(answer);
    }
}

