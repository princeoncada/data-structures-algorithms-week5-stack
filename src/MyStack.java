import java.awt.Component;
import javax.swing.JOptionPane;

public class MyStack {
    private int capacity;
    private int top = -1;
    private int[] arr;

    public MyStack() {
        this.capacity = 10;
        this.arr = new int[this.capacity];
    }

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public int capacity() {
        return this.capacity;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public int top() {
        return this.top;
    }

    public int peek() {
        return this.isEmpty() ? -1 : this.arr[this.top];
    }

    public void push(int data) {
        if (this.isFull()) {
            System.err.println("Error 101: Stack is full");
        } else {
            ++this.top;
            this.arr[this.top] = data;
        }

    }

    public String elements() {
        String hold = "";

        for(int i = 0; i <= this.top; ++i) {
            hold = hold + this.arr[i] + " ";
        }

        return hold;
    }

    public int pop() {
        int value = -1;
        if (this.isEmpty()) {
            System.err.println("Error 102: Stack is empty.");
        } else {
            value = this.arr[this.top];
            --this.top;
        }

        return value;
    }

    public int first() {
        return this.isEmpty() ? -1 : this.arr[0];
    }

    public int last() {
        return this.isEmpty() ? -1 : this.peek();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        if (!this.isEmpty()) {
            System.err.println("Current Capacity: " + this.getCapacity());
            JOptionPane.showMessageDialog((Component)null, "Warning: Everything in your stack will be lost.");
            this.capacity = capacity;
            this.arr = new int[this.capacity];
            this.top = -1;
        }

    }

    public String clear() {
        if (this.isEmpty()) {
            return "Stack is already empty";
        } else {
            this.top = -1;
            return "Stack is cleared. There is no element left";
        }
    }

    public void search(int data) {
        String remarks = "";

        for(int i = 0; i <= this.top(); ++i) {
            if (this.arr[i] == data) {
                remarks = data + " is found at index " + i;
                break;
            }

            remarks = data + " is NOT found in the stack";
        }

        JOptionPane.showMessageDialog((Component)null, remarks);
    }

    public int count() {
        return this.top + 1;
    }

    public boolean isFound(int data) {
        boolean found = false;

        for(int i = 0; i < this.top(); ++i) {
            if (this.arr[i] == data) {
                found = true;
            }
        }

        return found;
    }
}