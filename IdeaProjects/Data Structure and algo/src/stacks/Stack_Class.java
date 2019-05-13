package stacks;

import java.util.Stack;

public class Stack_Class {

    static void stack_push (Stack<Integer> stack){
        for (int i =0; i<5; i++){
            System.out.println(stack.push(i));
        }
    }

    static void stack_pop (Stack<Integer> stack){
        System.out.println("POP:  ");

        for (int i=0; i<4; i++){
           stack.pop();
        }
    }

    static void stack_peek (Stack<Integer> stack){
        Integer y = stack.peek();
        System.out.println("Peeked value is" + y);
    }

    static void stack_search (Stack<Integer> stack, int search){
        Integer pos = (Integer) stack.search(search);

        if (pos == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is at position: "+ pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_peek(stack);
        stack_pop(stack);
        stack_peek(stack);
        stack_push(stack);
        stack_search(stack, 2);

    }

}
