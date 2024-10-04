public class Main {
    public static void main(String[] args) {
        boxes box1 = new boxes(10,20,30);
        System.out.println("BOX 1 : "+box1.l+" "+box1.w+" "+box1.h);

        boxes box2 = new boxes();
        System.out.println("BOX 2 : "+box2.l+" "+box2.w+" "+box2.h);

        weight box3 = new weight(11,22,33,1000);
        System.out.println("BOX 3 : "+box3.l+" "+box3.w+" "+box3.h+" "+box3.weight);

        weight box4 = new weight();
        System.out.println("BOX 4 : "+box4.l+" "+box4.w+" "+box4.h+" "+box4.weight);

        price box5= new price(9,18,27,100,10000);
        System.out.println("BOX 5 : "+box5.l+" "+box5.w+" "+box5.h+" "+box5.weight+" "+box5.price );

        price box6 = new price();
        System.out.println("BOX 6 : "+box6.l+" "+box6.w+" "+box6.h+" "+box6.weight+" "+box6.price );

        price box7 = new price(50,1000,5000);
        System.out.println("BOX 7 : "+box7.l+" "+box7.w+" "+box7.h+" "+box7.weight+" "+box7.price);

    }
}