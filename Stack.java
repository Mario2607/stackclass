/**
 * Stack Program
 *
 * @param <T> Universal Stack element where u can put anything.
 */
public class Stack<T> {
    private Object[] objects;
    private int size;
    private int max;

    /**
     * Default constructor for the stack.
     * Initializes the stack with a default maximum capacity of 10.
     */
    public Stack() {
        this.max = 10;
        this.objects = new Object[this.max];
        this.size = 0;
    }

    /**
     * Constructor with a specified maximum capacity.
     *
     * @param max The maximum number of elements the stack can hold.
     * @throws IllegalArgumentException if the specified maximum is less than or equal to 0.
     */
    public Stack(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("illegal!");
        }
        this.max = max;
        this.objects = new Object[this.max];
        this.size = 0;
    }

    /**
     * Pushes an item onto the stack.
     *
     * @param item The item to be pushed onto the stack.
     * @throws StackFullException if the stack is full.
     */
    public void push(T item) throws StackFullException {
        if (size == max) {
            throw new StackFullException("full!");
        }
        objects[size++] = item;
    }

    /**
     * Pops an item from the stack.
     *
     * @return The item removed from the top of the stack.
     * @throws StackEmptyException if the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("empty!");
        }
        T item = (T) objects[--size];
        objects[size] = null;
        return item;
    }

    /**
     * Peeks at the item on the top of the stack without removing it.
     *
     * @return The item at the top of the stack.
     * @throws StackEmptyException if the stack is empty.
     */
    public T peek() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("empty!");
        }
        return (T) objects[size - 1];
    }

    /**
     * Lists all elements in the stack separated by a semicolon.
     *
     * @return A string representation of all stack elements.
     */
    public String list() {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += objects[i];
            if (i < size - 1) {
                text += ";";
            }
        }
        return text;
    }
}