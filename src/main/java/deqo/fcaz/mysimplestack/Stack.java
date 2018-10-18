package deqo.fcaz.mysimplestack;

import java.util.EmptyStackException;

public class Stack implements SimpleStack{

    private int size;
    private int[] pile;

    public Stack(int size, int[] pile) {
        this.size = size;
        this.pile = pile;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push(int val) {
        this.size += 1;
        this.pile[this.size - 1] = val;
    }

    public int peek() throws EmptyStackException {
        return pile[this.size];
    }

    public int pop() throws EmptyStackException {
        int i = pile[this.size - 1];
        this.size =- 1;
        return i;
    }
}
