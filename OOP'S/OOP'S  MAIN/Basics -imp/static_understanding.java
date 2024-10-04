class car{
    int seats;
    String brand;
    public car(int seats, String brand) {
        this.seats = seats;
        this.brand = brand;
    }
    
}
public class rough {
    class cars2{
        boolean expensive ;
        int money;
        cars2(boolean expensive,int money){
            this.expensive=expensive;
            this.money=money;
        }
    } 
    static class whiskey{
        static String whiskeyname;
        whiskey(String whiskeyname){
            this.whiskeyname=whiskeyname;
        }
    }
    
    public static void main(String[] args) {
        car car1= new car(1, "audi");
        rough obj1 = new rough(); // agar inner class non-static hai toh super class ka ek object banao or usse innerclass se jod do.
        cars2 carobj1= obj1.new cars2(true, 10000);
        System.out.println(carobj1.money);
        whiskey name1= new whiskey("duggu");
        System.out.println(name1.whiskeyname);
        whiskey name2 = new whiskey("ghaplu");
        System.out.println(name1.whiskeyname);// static hai toh ek hi object hai buss reference alag hogye hai.
        System.out.println(name2.whiskeyname);
    }
}
