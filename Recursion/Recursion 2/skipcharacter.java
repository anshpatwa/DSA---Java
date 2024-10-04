public class skipcharacter {
    // Method 1
    public static String trimed(String initial,String empty, int index){
     if (index==initial.length()) {
        return empty;
     }
     if (initial.charAt(index)=='a') {
        return trimed(initial, empty, index+1);
     }else{
        return trimed(initial, empty+initial.charAt(index), index+1);
     }   
     
    }
    // Method 2
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
    //  METHOD 3
    public static String skipstring(String initial,String skipthis){
        int skipthis_length= skipthis.length();
        if (initial.isEmpty()) {
            return "";
        }
        if (initial.startsWith(skipthis)) {
            return skipstring(initial.substring(skipthis_length), skipthis);
        }else{
            return initial.charAt(0)+skipstring(initial.substring(1), skipthis);
        }
    }
public static void main(String[] args) {
//     String first_name ="Ansh";
//     // String last_name ="Patwa";
//     // System.out.println(first_name+last_name);

//    System.out.println(first_name.substring(0));

//    String result = trimed("abra ka dabra", "", 0);
//    System.out.println(result);
   skip("baccad", "");
   System.out.println(skipstring("baccapplegfd", "apple"));
  
}    
}
