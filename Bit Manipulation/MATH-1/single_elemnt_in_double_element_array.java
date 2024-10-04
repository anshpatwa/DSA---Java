// XOR of x with 0 with give you x
//x^0 =x
/*
 for array
 arr[0]^arr[1]^arr[2]^arr[3]..........
 the element that does not have a duplicate will give the number itself.
 XOR follow associative property of maths.
 */
public class single_elemnt_in_double_element_array {
    public static int findUnique(int[]arr){
        int unique =0;
        for(int i:arr){
            unique ^=i;
        }
        return unique;
    }
    public static void main(String[] args) {
        int[] arr={2,3,3,4,2,6,4};
        System.out.println(findUnique(arr));
    }
    
}

// you can use this code with number appears even number of times in array.for example in this question number appears 2 times in an array.

// but not when the nuber appears odd number of times in array