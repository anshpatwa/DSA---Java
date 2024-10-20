import java.util.ArrayList;

public class permutations_in_string {
    // substring(inclusive , exclusive)
    static void permutations(String empty, String processed){
        if (processed.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch = processed.charAt(0);
        for (int i = 0; i <= empty.length(); i++) {   // agar 1 se chalo karunga toh +1 krna padega
            String first = empty.substring(0,i);
            String second = empty.substring(i,empty.length());
            permutations(first+ch+second,processed.substring(1));
        }

    }
    static ArrayList<String> permuationslist(String empty,String processed){
        if (processed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(empty);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = processed.charAt(0);
        for (int i = 0; i <= empty.length(); i++) {
            String first = empty.substring(0,i);
            String second = empty.substring(i,empty.length());
            ans.addAll(permuationslist(first+ch+second,processed.substring(1)));

        }
        return ans;
    }
    static int permuationsCount(String empty, String processed){
        if (processed.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = processed.charAt(0);
        for (int i = 0; i <= empty.length(); i++) {
            String first = empty.substring(0,i);
            String second = empty.substring(i,empty.length());
            count=count + permuationsCount(first+ch+second,processed.substring(1));
        }
        return count;
    }
    public static void main(String[] args) {
       // permutations("", "abc");
        ArrayList<String> permutations = permuationslist("","ABC");
        System.out.println(permutations);
        System.out.println(permuationsCount("","ABC"));
    }
}
