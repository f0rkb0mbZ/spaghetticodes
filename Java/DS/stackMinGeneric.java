class mystack<T> {
    T[] arr;
    int top;
    int default_cap = 10;
    int default_min = Integer.MAX_VALUE;

    public mystack() {
        this.top = 0;
        this.arr = (T[]) new Object[this.default_cap];
    }

    public void push(T data) {
        this.arr[this.top] = data;
        this.top++;
    }

    public T pop() {
        return this.arr[(this.top--) - 1];
    }

    public void printAll() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.println(this.arr[i]);
        }
    }
}

public class stackMinGeneric {
    public static void main(String[] args) {
        mystack<Integer> st = new mystack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        // st.printAll();
        System.out.println(st.pop());
    }
}