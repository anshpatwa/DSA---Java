
public class objectprnt {
    int num;
    public objectprnt(int num){
        this.num=num;
    }

    @Override
    public String toString() {   // Bydefault it is extending above method
        return "objectprnt{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        objectprnt obj = new objectprnt(54);
        System.out.println(obj);  // random value cause inbuilt/default valueof function is used.
    }
}


//You cannot override the method which is declared as FINAL.hence also known as late binding. . this can be used to prevent Inheritance.