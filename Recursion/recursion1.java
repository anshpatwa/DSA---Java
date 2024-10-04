public class recursion1 {
    // when a functioon finishes executing .it is removed from stack ,and the flow of program is restored to where that function was called.and it always ends on main fucntion.
    // you can convertt recursion solution into iteration & vice-verse.
    public static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    public static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    public static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    public static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    public static void print5(int n){
        System.out.println(n);
    }
    // all in one

    public static void print(int n ,int end){
        if (n==end) {
            System.out.println(end);
            return;   // returning to main
        }
        System.out.println(n);
        print(n+1,end);
    }

    public static void main(String[] args) {
        print(90,100);
    }
}
