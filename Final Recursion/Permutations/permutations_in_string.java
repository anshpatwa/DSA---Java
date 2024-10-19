public class permutations_in_string {
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
    public static void main(String[] args) {
        permutations("", "abc");
    }
}
