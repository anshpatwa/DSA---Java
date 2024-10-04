import java.util.Arrays;

class when_outside { // static lagane se hi hoga verna main me error de dega
   String name; // isko static krdena jub when_outside.name kro
    public when_outside(String name) {
        this.name = name; // agar isko when_outside.name krdunga toh dono output me patwa2 dikheygea.
    }
  }

public class innerclasses {

 static class when_inside { // static lagane se hi hoga verna main me error de dega
    String name;
    public when_inside(String name) {
        this.name = name;  // agar yaha when_inside.name krdunga toh error aayega kyuki when_inside wali class static hai toh object peh dependent nhi hai whereas .name wala object peh dependent hai.
    }
    public String toString() {
      return name;
  }
  }
  public static void main(String[] args) {
    when_inside obj1 = new when_inside("ansh1");
    when_inside obj2 = new when_inside("ansh2");
    System.out.println(obj1.name);
    System.out.println(obj1);  // cause of String function
    System.out.println(obj2.name);
    when_outside out1= new when_outside("patwa1");
    when_outside out2= new when_outside("patwa2");
    Arrays.toString(args);
    
    System.out.println(out1.name);
    System.out.println(out2.name);

  }
}


 // outside classes cannot be static cause inner classes are dependet on outside class

// if you put static for innerclass then it will not be dependent on objects of outer class.else you can also put the inner class outside the outer class in that can also it will not be depent on any object. but in second case you have to create the objects for the class that you have put outside the outer class.

// its all because outer class cannot be static and then the inner class is dependent on outter class so non-static ko toh lagega hi nah object. or agar bahar krdete hai inncer class ko outer class se toh woh khud non-static bn jayage or fhir usko bhee ek object chahiye jo ki tumhey ccreate krna padega.