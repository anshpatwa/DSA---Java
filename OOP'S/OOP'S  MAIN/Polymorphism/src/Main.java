public class Main {
    public static void main(String[] args) {
    Shapes shape = new Shapes();
    circle circle = new circle();
    square square = new square();
    Triangle triangle = new Triangle();

    shape.area();
    circle.area();
    square.area();
    triangle.area();


    // METHOD_OVERRIDING

/*
                    Parent OBJ = new Child();
            hence ,which method will be called depends on Child class.
                      Known as Upcasting.
 */


    Shapes circle2= new circle();
    Shapes Square2= new square();
    Shapes triangles2 = new Triangle();
        circle2.area();
        Square2.area();
        triangles2.area();

    }
}

// POLYMORPHISM -->The word polymorphism means having many forms. In simple words, we can define Java Polymorphism as the ability of a message to be displayed in more than one form.