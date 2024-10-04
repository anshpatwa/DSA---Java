import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        student ansh = new student(1,86.99f);
        student ayush = new student(2,85.99f);
        student jayesh = new student(3,60.99f);
        student manav = new student(4,54.99f);
        student anakta = new student(5,99.99f);
        student dhruv = new student(2,75.99f);
        student[] list = {ansh,ayush,jayesh,manav,anakta,dhruv};
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });
        Arrays.sort(list,(o1,o2) -> -(int)(o1.marks - o2.marks));// int ke phele wala '-'(minus) descending me sort krta hai.
        System.out.println(Arrays.toString(list));

        if (ayush.compareTo(ansh)<0){
            System.out.println(ayush.compareTo(ansh));
            System.out.println("ansh has more marks");
        }
    }
}