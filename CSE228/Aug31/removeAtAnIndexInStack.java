import java.util.Stack;

public class removeAtAnIndexInStack {

    public static Stack<Integer> removeAtAnIndex(Stack<Integer> stack, int index) {
        Stack<Integer> tempStack = new Stack<>();
        int lenthOfTopStack = stack.size() - index - 1;
        for (int i = 0; i < lenthOfTopStack; i++) {
            tempStack.push(stack.pop());
        }
        stack.pop();
        for (int i = 0; i < lenthOfTopStack; i++) {
            stack.push(tempStack.pop());
        }
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original Stack: " + stack);
        stack = removeAtAnIndex(stack, 2);
        System.out.println("Manupulated stack: " + stack);
    }
}