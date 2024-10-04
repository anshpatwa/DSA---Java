package Method_Overloading;
/*
             STATIC POLYMORPHISM     /   COMPILE TIME

     same name but type;argument,return type;ordering can be different
 */
public class overloading {
    static int sum(int a,int b){
        return  a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
      int sum1=sum(1,2);
        System.out.println(sum1);
      int sum2= sum(5,2,3);
        System.out.println(sum2);

    }
}
