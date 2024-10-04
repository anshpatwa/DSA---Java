public class Student_data_basics {
    public static class Student {
    int rollno;
    String name;
    Float marks;
    static String school ="Sagar Public School"; 
    public Student(){
        // this is how you call a constructor from another constructor
        this(0,"deafault person",0f);
    }  // deafault constructor is initialised here hence it is not giving error in student1 exapmle.

     // constructor overloading
    public Student(Student other){
        this.rollno=other.rollno;
        this.name=other.name;
        this.marks=other.marks;
    }
    public Student(int rollno_batao,String name_batao,Float marks_batao){   // can have differnt names 
        this.rollno=rollno_batao;
        this.name=name_batao;
        this.marks=marks_batao;
    }
    }
    public static void main(String[] args) {
        Student student1 =new Student();
        student1.rollno=1;
        student1.name="ansh";
        student1.marks=99.9f;
        System.out.println(student1.marks);
        
        
        // Using Constructor
        Student student2=new Student(2, "ayush", 99.8f);
        //System.out.println(student2);


        Student random =new Student(student2);
        System.out.println(random.rollno);


        Student randoom2 = new Student();
        System.out.println(randoom2.name);
        randoom2.name="abcde";    // you can also initialise it.
        System.out.println(randoom2.name);


        Student random3 =student1;   // no new object is created , it points to the student1 object
    }
}
