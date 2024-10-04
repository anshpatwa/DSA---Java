import java.util.Arrays;

public class L_search1D {
    // Searching in String Array
    public static void Rangesearch(String str,int start,int end,char target){
        for(int i=start;i<=end;i++){
            if (str.charAt(i)==target) {
                System.out.println("found at:"+i);
            }
        }
    } 
    public static void main(String[] args) {
     // Searching of an element
    //    int[] arr ={18,12,9,14,77,50};
    //    for(int i =0;i<arr.length;i++){
    //         if (arr[i]==14) {
    //             System.out.println("Found at :"+(i)+" position");
    //             break;
    //         }
    //    }


    //Greatest Element
        // int max =arr[0];
        // for(int i =0;i<arr.length;i++){
        //     if (arr[i]>max) {
        //         max=arr[i];
        //     }
        // }
        // System.out.println(max);
        
    // Smallest element
    
    int[] arr={18,12,-7,3,14,28};
    int Smallest = arr[0];
    for(int i=0;i<arr.length;i++){
        if (arr[i]<Smallest) {
            Smallest=arr[i];
            
        }
    }
    System.out.println(Smallest);

    // Searching an element in a String
        //     String kuchbhee="abcdefghijklmnopqrstuvwxyz";
        //     char target='u';
        //     for(int i =0;i<kuchbhee.length();i++){
        //         if (target==kuchbhee.charAt(i)) {
        //             System.out.println("found at:"+i);                   
        //         }
        //     }
        //     System.out.println(kuchbhee.toCharArray());
        //     Rangesearch(kuchbhee, 4, 25, 'u');


        // char[] array=kuchbhee.toCharArray();
        // String newarr=Arrays.toString(array);
        // System.out.println(newarr);


        //    System.out.println(Arrays.toString(kuchbhee.toCharArray()));
       
    }
    
}
