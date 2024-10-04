public class stackmemory {
    static void print1(int n){
        System.out.println(n); // step 3
        print2(2);  // step 4
        System.out.println("Function Over :1");// step 16
    }
    static void print2(int n){
        System.out.println(n); // step 5
        print3(3); // step 6
        System.out.println("Function Over :2");// step 15
    }
    static void print3(int n){
        System.out.println(n); // step 7
        print4(4); // step 8
        System.out.println("Function Over :3");// step 14
    }
    static void print4(int n){
        System.out.println(n); // step 9
        print5(5);  // step 10
        System.out.println("Function Over :4");// step 13
    }
    static void print5(int n){
        System.out.println(n); // step 11
        System.out.println("Function Over :5"); // step 12
    }
    public static void main(String[] args) {
        System.out.println("Main Function Begins");  // step 1
        print1(1); // step 2
        System.out.println("Function over : Main");// step 17 
    }
    
}

/* ----------------------------------

 ->Point 1 
    While the function is not finished executing it wil remian in stack.

->Point 2
    When a function finishes executing it is removed from the stack and the  flow of program is restored to where that function was called.

------------------------------------------------------*/
