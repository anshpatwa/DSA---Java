public class Enums_example {
    enum Week implements A{  // but cannot extend classes.
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constructor
        // defaulty set to public,static and final
        //since its final and yoou cannot create child enums
        // type is Week
        Week(){
            System.out.println("Constructor called for:"+this);
            // this is not public or protected ,only private or default
            // why? we dont want to create new objects
            // this is not the enum concept,thats why

            // internally: public static final week Monday = new Week();
        }

        @Override
        public void hello() {
            System.out.println("Hello!!! How are You ??");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week);
        System.out.println(week.ordinal());
        week.hello();

//        week =Week.Thursday;   //3
//        System.out.println(week.ordinal());
//        System.out.println(week);

//        for(Week day:Week.values()){
//            System.out.println(day);
//        }


    }
}
