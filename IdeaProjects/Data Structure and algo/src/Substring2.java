public class Substring2 {

    public static int count (String A, String B){
        int count = 1;
        while (A.length() < B.length()) {

            A = A.concat(A);
            count++;
        }
            if(A.contains(B)){
                return count;
            }else {
                A = A.concat(A);
                count++;
            }
            if (A.contains(B)){
            return count;
            } else {
                return -1;
            }
    }

    public static void main(String[] args) {
        String A = "abcd", B = "cdabcdab";
        int ans;
        ans = count(A, B);
        System.out.println(ans);
    }
}
