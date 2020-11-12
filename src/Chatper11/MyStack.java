package Chatper11;
import java.util.ArrayList;

public class MyStack extends ArrayList {

    ArrayList stack = new ArrayList();
    int length = stack.size();

    MyStack() {
        this.stack.add(0);
    }

    MyStack(int num) {
        this.stack.add(num);
    }

    public void push(int num) {
        ++this.length;
        this.stack.add(num);
    }

    public int pop() {
        int num = (int) this.stack.get(length - 1);

        this.stack.remove(length - 1);
        this.length--;
        return num;
    }

    public int getSize() {
        return this.length;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public Object peek() {
        return stack.get(getSize() - 1);
    }

    public void display() {
        for (Object element : this.stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack hello = new MyStack(10);
        hello.display();
        hello.push(13);
        hello.push(15);
        hello.push(39);
        hello.display();
        System.out.println(hello.pop());
        hello.display();
        System.out.println(hello.getSize());
        System.out.println(hello.isEmpty());
        System.out.println(hello.peek());


    }

}
