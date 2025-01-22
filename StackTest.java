public class StackTest {
    public static void main(String[] args) {
        try {
            Stack<Integer> numberStack = new Stack<>(5);
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Number stack after pushes: " + numberStack.list());
            System.out.println("Peek top element: " + numberStack.peek());
            System.out.println("Popped element: " + numberStack.pop());
            System.out.println("Number stack after pop: " + numberStack.list());
            numberStack.pop();
            numberStack.pop();
            System.out.println("Number stack after popping all elements: " + numberStack.list());
            try {
                numberStack.pop();
            } catch (StackEmptyException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
            Stack<String> textStack = new Stack<>(3);
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text stack after pushes: " + textStack.list());
            System.out.println("Peek top element: " + textStack.peek());
            System.out.println("Popped element: " + textStack.pop());
            System.out.println("Text stack after pop: " + textStack.list());
            textStack.pop();
            System.out.println("Text stack after popping all elements: " + textStack.list());
            try {
                textStack.pop();
            } catch (StackEmptyException e) {
                System.out.println("exception: " + e.getMessage());
            }
            textStack.push("A");
            textStack.push("B");
            textStack.push("C");
            try {
                textStack.push("D");
            } catch (StackFullException e) {
                System.out.println("exception: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
}
