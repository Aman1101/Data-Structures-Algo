package crakingthecodinginterview;

public class URLify2 {
        public static char[] replace (String s, int actualLength){

            int index = s.length();
//        StringBuilder t = new StringBuilder(s);
            char [] c = s.toCharArray();
            for(int i = actualLength-1 ; i >=0; i--) {
                if (c[i] == ' '){
                    c[index-1] = '0';
                    c[index-2] = '2';
                    c[index-3] = '%';
                    index = index - 3;
                }else {
                    c[index-1] = c[i];
                    index = index - 1;
                }
            }
            return c;

        }

        public static void main(String[] args) {
            String s = "as bs cfg asdfg      ";
            int length = 15;
            char[] answer = URLify2.replace(s, length);
            for(int i =0; i < answer.length; i++) {
                System.out.print(answer[i]);
            }
        }

    }
