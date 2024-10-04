public class Main {
    public static void main(String[] args) {
        son son1 = new son("coder","ghaplu");
        son1.career();

        daughter daughter1 = new daughter("doctor","ansh");
        daughter1.career();

        parent.hello();

    }
}
/*
    1. An instance of an abstract class can not be created.
    2. Constructors are allowed.
    3. We can have an abstract class without any abstract method.
    4. There can be a final method in abstract class but any abstract method in class(abstract class) can    not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
    5. We can define static methods in an abstract class
    6. We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
    7. If a class contains at least one abstract method then compulsory should declare a class as abstract
    8.If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method

 */
