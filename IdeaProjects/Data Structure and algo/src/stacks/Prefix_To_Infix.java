package stacks;

import java.util.Stack;

public class Prefix_To_Infix {

    static boolean operatorCheck(char ch){

        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
        }

        static String prefixToInfix(String exp){
            Stack<String> stack = new Stack<String>();

            for(int i =exp.length()-1 ; i>=0; i--){

                Character c = exp.charAt(i);
                if(!operatorCheck(c)){
                    stack.push(c.toString());
                }else{
                    String op1 = stack.peek();
                    stack.pop();
                    String op2 = stack.peek();
                    stack.pop();

                    String temp = "(" + op1 + c + op2 + ")";

                    stack.push(temp);
                }
            }
            return stack.peek();
        }

    public static void main(String[] args) {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println(prefixToInfix(pre_exp));
    }
    }
