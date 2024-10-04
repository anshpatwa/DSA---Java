import java.util.Arrays;

public class customarraylist {
    private int[] data;
    private int DEFAULT_SIZE=10;
    private int size =0;

    public customarraylist(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] temp = new int[data.length *2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data =temp;
    }
    public int size(){
        return data.length;
    }
    public int get(int index){
        return data[index];
    }
    public void swap(int index1, int index2){
        int temp2 =data[index1];
        data[index1]=data[index2];
        data[index2]=temp2;
    }
    public void remove(int index){
        data[index]=0;
    }
    public void set(int index,int value){
        data[index]= value;
    }

    @Override
    public String toString() {
        return "customarraylist{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        customarraylist list1 = new customarraylist();
        for (int i = 0; i <= 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);
    }
}
// but isme tum sirf int add kr skte ho .