public class Human_2nd_static {
    public static class Human{
        int age;
        String name;
        int salary;
        boolean married;
        static long population; 
        public Human(int age, String name, int salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population +=1;
        }
    }
    static void fun(){  // this is not dependet on objects
        greeting(); // you cant use this beacuse it requires an instances
        //but the function you are using it in does not depend on instances.

        Human_2nd_static obj = new Human_2nd_static();// well now you can access it.
        obj.greeting();
    }
    void greeting(){ // we know that something which is not static ,belongs to an object
        System.out.println("greetings"); // object for this method is needed and needed.
        fun();   // you can have static in non-static 
    }
    public static void main(String[] args) {
        Human person1 = new Human(45, "Unlce", 20000,true);
        Human person2 = new Human(50, "chacha", 50000, false);
        System.out.println(person1.population);
        Human person3 = new Human(53, "Tao", 5000, true);
        System.out.println(person3.population);


        fun();  // isko me access kr skta ho binna koi object banaye kyuki yeh static hai
        greeting(); // yeh error de rha hai kyuki isko access nnhi kr skte yeh non-static hai ,isko object chahiye run hoone ke liye.
        Human_2nd_static obj = new Human_2nd_static();// well now you can access it.
        obj.greeting();

    }
}
