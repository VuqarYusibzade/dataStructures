public class Stack<T> {
    private T[] items;
    private int top;
    private int kapasite;

    public Stack(int kapasite) {
        this.kapasite = kapasite;
        this.items = (T[]) new Object[kapasite];
        this.top = -1;
    }

    public void push(T element) {
        if (top == kapasite - 1) {
            System.out.println("Stack doludur! Element " + element + " əlavə edilə bilmir.");
            return;
        }

        items[++top] = element;
        System.out.println("Əlavə edilən element: " + element);
    }

    public T pop() {
        if (bosdu()) {
            System.out.println("Stack boşdur!.");
            return null;
        }

        T cixarilanElement = items[top];
        items[top--] = null;
        return cixarilanElement;
    }

    public boolean bosdu() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>(5);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Çıxarılıb alınan element: " + myStack.pop());

    }
}
