public class Pattern_1_10 {
    // https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){   // for(int j=0;j<=n-row+1;j++)
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        // use pen and notebook
        for(int i=1;i<=2*n;i++){
            if (i>n) {
                for(int j=1;j<=(2*n-i);j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                } 
            }
            System.out.println();
        }
    }
    public static void pattern5_official(int n){
        for(int i=1;i<2*n;i++){
            int totalcolinrow=i>n ? 2*n -i:i;
            // if i>n then totalcolinrow = 2*n-i(j<totalcolinrow) else totalcolinrow =i;
            // totalcolinrow = 2*n-i because we are checking (j<totalcolinrow)
           
            for(int j=1;j<=totalcolinrow;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        int spaces=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (j>spaces) { 
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            spaces--;
            System.out.println();
        }
    }
    public static void pattern6_official(int n) {
        for(int i=0;i<n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int z=0;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        int spaces=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
               if (j>spaces) {
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            spaces++;
            System.out.println();
        }
    }
    public static void pattern7_official(int n){
        for(int i=0;i<=n;i++){
            int space=i;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int z=0;z<n-i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern8_official(int n){
        int col = 4 ;
        for(int i=1;i<=n;i++){
            col++;
            int spaces=  n-i;
            int stars = 2*i-1;
            for(int j=0;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int z=0;z<stars;z++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void pattern9_official(int n){
        for(int i=0;i<n;i++){
            int col = 2*n-1-i;
            // int spaces =i;
            // int stars=col-spaces;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int z=0;z<col-i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern10_official(int n){
        for(int i=1;i<=n;i++){
            int col =i+9;
            int spaces=2*n-i;
            int stars =i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int z=1;z<=stars;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         pattern10_official(10);
      
        
    }
}
