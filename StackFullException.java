/**
 * Exception thrown when attempting to push an element into a full stack.
 */
public class StackFullException extends Exception {
    /**
     * Constructor for StackFullException.
     * @param message The exception message indicating the stack is full.
     */
    public StackFullException(String message) {
        super(message);
    }
}