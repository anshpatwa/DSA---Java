import java.util.ArrayList;
import java.util.Arrays;

public class string_Theory {
    public static void main(String[] args) {
       // Strings are immutable
    //    String a ="ansh"; // obj 1
    //    String b ="ansh"; // b points to the obj 1 . no new object is created
    //    System.out.println(a);
    //    a="patwa"; // obj 2  . now a points to obj 2.
    //    System.out.println(a);

       // comparison
    //    String a ="ansh";
    //    String b ="ansh";
    //    System.out.println(a==b);
       // true means that refrence variables(a,b) are pointing to the same thing.
        

       // creating 2 diff objs with same value
    //    String a =new String("ansh"); // new creates new obj  -obj1
    //    String b =new String("ansh"); //-obj2
    //    String c =a;
    //    System.out.println(c==a); // cause both vairable points to the same obj
    //    System.out.println(a==b); //false // == check if they are pointing to the same obj or not.
    //    System.out.println(a.equals(b));  // this compares the values.

       // print stream class
    //    System.out.println(Arrays.toString(new int[]{1,2,3,4,5})); // ctrl + click on toString
        // all the values are converted to String values to print it
        // example - if you print 56 , it is convertted to String then then is printed.
        // you dont need to change the datatype for wrapper class.
        // you can create functions like Arrays.toString().

        // Pretty Printing
        // place holders in java String
        // printf = String Formatting
      //   float a=453.12345f;
      //   System.out.printf("formatttted number is %.3f",a); // shows 2 number after the decimal.
      //   System.out.println();
      //   System.out.printf("Pie :%.3f",Math.PI);
      //   System.out.println();
      //   System.out.printf("hello my name is %s and i am %s","Ansh","cool");
       // check the png file for various placeholders in java


      // ASCII VALUE
      //https://www.prepbytes.com/blog/general/ascii-values-of-alphabet/
      // a-z (97-122)
      //A-Z (65-90)



        // String CONCATENATTION
      //   System.out.println('a'+'b');// converting it to the integer value(ASCII value)
      //   System.out.println("a"+"b"); // string concated // operator overloading // new obj is created in garbage memory because a+b is not stored somewhere.
      //   System.out.println("a"+1); // int will be converted to Integer which will call toString()
      //   System.out.println("abc"+new Integer(56)); // same as aboive for wrapper class .
      //   System.out.println((char)('a'+3));
      //   System.out.println("ansh"+new ArrayList<>());
      // if any of the element is string then the other is also converted to string
      // System.out.println("a"+'b');

      // String Performance
      // String series ="";
      // for(int i=0;i<26;i++){
      //    char ch =(char)('A'+i); // new obj is created on every addition
      //    series =series+ch;
      // }
      // System.out.println(series);



      //String Builder 
      // used so that new obj is not created everytime . the lone string gets modified everytime
      // StringBuilder builder = new StringBuilder();
      // for(int i=0;i<26;i++){
      //    char ch =(char)('A'+i); // builder sttring gets modified eveyrtime.
      //    builder.append(ch);
      // }
      // System.out.println(builder.toString());
      // System.out.println(builder.reverse());
      // builder.deleteCharAt(0);
      // System.out.println(builder.toString());


      // String to char Array
      String name="bhang bhosda";
      System.out.println(Arrays.toString(name.toCharArray()));
      System.out.println(name.indexOf('g'));
      System.out.println("   rundwaaa      ".strip());   // same as trim
      System.out.println(Arrays.toString(name.split(" ")));
    }
}
