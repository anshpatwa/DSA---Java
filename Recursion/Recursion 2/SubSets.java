import java.util.ArrayList;

public class SubSets {
  public static void subSeq(String initial,String empty){
    if (initial.isEmpty()) {
        System.out.println(empty);
        return ;
    }
    char ch = initial.charAt(0);
    subSeq(initial.substring(1), empty+ch);
    subSeq(initial.substring(1), empty);
  }

  // Return In form of ArrayList
  public static ArrayList<String> subSeq2(String initial,String empty){
    if (initial.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(empty);
        return list ;
    }
    char ch = initial.charAt(0);
    ArrayList<String> left =subSeq2(initial.substring(1), empty+ch);
    ArrayList<String> right =subSeq2(initial.substring(1), empty);
    left.addAll(right);
    return left;
  }

  // return with ASCII value
  public static void subSeq3(String initial,String empty){
    if (initial.isEmpty()) {
        System.out.println(empty);
        return ;
    }
    char ch = initial.charAt(0);
    subSeq3(initial.substring(1), empty+ch);
    subSeq3(initial.substring(1), empty);
    subSeq3(initial.substring(1), empty+(ch+0));
  }

  // Return ASCII with ArrayList
  public static ArrayList<String> subSeq4(String initial,String empty){
    if (initial.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(empty);
        return list ;
    }
    char ch = initial.charAt(0);
    ArrayList<String> first =subSeq4(initial.substring(1), empty+ch);
    ArrayList<String> second =subSeq4(initial.substring(1), empty);
    ArrayList<String> third =subSeq4(initial.substring(1), empty+(ch+0));
    first.addAll(second);
    first.addAll(third);
    return first;
  }

    public static void main(String[] args) {
      subSeq("abc", "");
      System.out.println(subSeq2("abc", ""));
      subSeq3("abc", "");
      System.out.println(subSeq4("abc",""));

        // How to Get ASCII value of any character
      Character ch ='a';
      System.out.println(ch+0);
    }
}
// Debug krke samaj mast program hai .