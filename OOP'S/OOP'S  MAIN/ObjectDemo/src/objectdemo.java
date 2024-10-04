public class objectdemo {
    int num;
    String name;

    public objectdemo(int num) {
        this.num=num;
    }

    public objectdemo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public int hashCode() {// unique representation of an object using numbers.
        return super.hashCode(); // it is not a address
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((objectdemo)obj).num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
public static void main(String[] args) {
    objectdemo obj1 = new objectdemo(32);
    objectdemo obj2 = new objectdemo(32);
    objectdemo obj3 = obj1;
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    System.out.println(obj3.hashCode());
    if (obj1.equals(obj2)){
        System.out.println("yes Equal");
    }
    System.out.println(obj1 instanceof objectdemo); // check the object belonging class

    System.out.println(obj1.getClass());     // tells you the name the of the object belonging class
//    System.out.println(obj1.getClass().); // dot hatta ke laga ek bar
}
}
