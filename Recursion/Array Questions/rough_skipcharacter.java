public class rough_skipcharacter {
    // Method 1
     public static String trimed(String initial,String empty, int index){
      if (index==initial.length()) {
          System.out.println(empty);
         return empty;
      }
      if (initial.charAt(index)=='a') {
         return trimed(initial, empty, index+1);
      }else{
         return trimed(initial, empty+initial.charAt(index), index+1);
      }

     }
     //Method 2
    public static void skip(String initial,String empty){
        if (initial.isEmpty()) {
            System.out.println(empty);
            return;
        }
        char ch = initial.charAt(0);
        if (ch =='a') {
            skip(initial.substring(1), empty);
        }else{
            skip(initial.substring(1), empty+ch);
        }
    }
    public static void main(String[] args) {
        skip("baccad", "");
        System.out.println(trimed("baccad","",0));
    }
}
