public class basic1 {
    static void print(int n){
        if (n==5) {
            return;
        }
        System.out.println(n);
        print(n+1);
        System.out.println("Function over :"+n);
    }
    static void printFor(int num){ // printRev(5)-->printRev(4)-->printRev(3)-->printRev(2)-->printRev(1)
        if (num==0) {
            return ;
        }
        printFor(num-1);
        System.out.println(num);
    }
    static void printRev(int num){
        if (num==0) {
            return;
        }
        System.out.println(num);
        printRev(num-1);
    }
    public static void main(String[] args) {
        // print(1);
        printFor(5);
        printRev(5);
    }
      
}
