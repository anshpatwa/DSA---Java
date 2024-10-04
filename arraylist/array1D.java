import java.util.Arrays;
import java.util.Scanner;

public class array1D {
    public static void main(String[] args) {
        
        // int [] rollnos= new int[5];  // this is just the declaration
        // arr[0]=45;
        // arr[1]=55;
        // arr[2]=65;
        // arr[3]=75;
        // arr[4]=85;
        // new is used to create an object.
        
        
        // initally [0,0,0,0,0] // cause yeh int ka array hai . agar string ka hota toh "null".even for boolean array it is "null"
        
        
        // int[]rollnos={1,2,3,4,5};   // this is actually the object being created.
        // for(int i :rollnos){
        //     System.out.print(i+" ");
        // }
        
        
        // Boolean[] hurkuch = new Boolean[5];
        // System.out.println(hurkuch[1]);   // hurkuch[1] is itself a single object.




        Scanner sc = new Scanner(System.in);
    //     int[] arr = new int[5];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
    // //    for(int j =0;j<arr.length;j++){
    // //     System.out.print(arr[j]+" ");
    // //    }
    //     // for(int i :arr){
    //     //     System.out.println(arr[i]);               // index out of bound error . [5] ka kuch error hai
    // System.out.println(Arrays.toString(arr));      // OG
    // System.out.println(Arrays.toString(arr));
    

        String[] name = new String[5];
        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }
        System.out.println(Arrays.toString(name));
        name[1]= "ansh";
        System.out.println(Arrays.toString(name));
        

    }
}
