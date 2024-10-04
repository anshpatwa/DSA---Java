import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        // INITIALISATION
        for(int i =0;i<3;i++){                 // isme apan ne [1, 2, 3], [4, 5, 6], [7, 8, 9] yeh 3 'i' build kiye
        list.add(new ArrayList<>());
        }
        // ADD ELEMENTS
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){              // isme apan ne array ke andar array daala.
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        
    }
    
}
