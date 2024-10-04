import java.util.Arrays;

public class generic_customarraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size =0;
    public generic_customarraylist(){
        data=new Object[DEFAULT_SIZE];
    }
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        generic_customarraylist<Integer> list2 = new generic_customarraylist<>();
        for (int i = 0; i < 14; i++) {
            list2.add(2 * i);
        }

        System.out.println(list2);
        generic_customarraylist<Character> list3 = new generic_customarraylist<>();
        int baseValue = 97; // ASCII value of 'a'
        for (int i = 0; i <= 26; i++) {
            char c = (char) (baseValue | i);
            list3.add(c);
        }
        System.out.println(list3);
    }
}
