/**
 * Exception thrown when attempting to pop or peek an element from an empty stack.
 */
public class StackEmptyException extends Exception {
    /**
     * Constructor for StackEmptyException.
     * @param message The exception message indicating the stack is empty.
     */
    public StackEmptyException(String message) {
        super(message);
    }
}