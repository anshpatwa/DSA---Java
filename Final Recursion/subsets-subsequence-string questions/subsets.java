import java.util.ArrayList;
import java.util.Arrays;

public class subsets {
    static void subSets(String empty, String og){
        if (og.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch = og.charAt(0);
        subSets(empty+ch,og.substring(1) );
        subSets(empty,og.substring(1));
    }
    // return an arraylist of subsets
            // Approach 1
    static ArrayList<String> arrsubsets(String empty,String main){
        if (main.isEmpty()){
          ArrayList<String> answer = new ArrayList<>();
          answer.add(empty);
          return answer;
            }
        char ch = main.charAt(0);
        ArrayList<String> left=arrsubsets(empty+ch,main.substring(1));
        ArrayList<String> right=arrsubsets(empty,main.substring(1));
        left.addAll(right);
        return left;

    }
            // Approach 2
    public static void main(String[] args) {
        subSets("", "ABC");
        System.out.println(arrsubsets("","abc"));
    }
}
// either the ignore the element or keep the element