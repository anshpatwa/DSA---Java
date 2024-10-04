public class static_block {
    static int a =4;
    static int b;
    // Static Block - will only run once , when the first obj is created i.e when class is loaded for the first time
    static{
        System.out.println("I am Inside Static Block");
        b =a*5;
        a++;
    }
    public static void main(String[] args) {
        static_block obj = new static_block();
        System.out.println(static_block.a+" "+static_block.b);
        static_block.b+=3;
        System.out.println(static_block.a+" "+static_block.b);
        static_block obj2 = new static_block(); // here ("I am Inside Static Block") will not be printed cause it is already printted for the obj1.
        System.out.println(static_block.a+" "+static_block.b);// here b does not gets multiply with a*5 again. cause static block only runs once.
    }
}

/*
 Static variables are shared among all objects of a class.
 Static blocks are executed only once, when the class is first loaded.
 Static blocks are typically used to initialize static variables or perform other actions that need to be done only once before any objects of the class are created.
 */