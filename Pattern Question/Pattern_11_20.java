public class Pattern_11_20 {
    
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
    }public static void pattern_11(int n){
        for(int i=1;i<=n;i++){
            int col =n;
            int spaces=i-1;
            int stars=col-spaces;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int z=1;z<=stars;z++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void patttern_12(int n){
        for(int i=0;i<2*n;i++){
            int col=n;
            int spaces =i>n?(2*n)-i:i;
            int stars =col-spaces;
            for(int j=0;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int z=0;z<=stars;z++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void pattern_12_easy(int n){
        pattern_11(n);
        pattern10_official(n);
    }
    public static void pattern_12_2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(2 * n - (2 * i + 1)));
        }
    
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(2 * n - (2 * i + 1)));
        }
    }

    public static void pattern_13(int n){
     for (int i = 1; i <=n; i++) {
        int bef_spaces = n-i;
        int cent_spaces=-1;
        for (int j =1; j <= bef_spaces; j++) {
            System.out.print(" ");
        }
        // cent_stars +=2;
        System.out.print("*");
        for (int j = 0; j <= cent_spaces; j++) {
            System.out.print( " ");
            
        }
        cent_spaces = cent_spaces+2;
        System.out.print("*");
        System.out.println();
     }
        
    }
    public static void Patter28_official(int n){
        for (int i = 1; i <2*n; i++) {
            int bef_spaces=i>n?(i-n):n-i;
            int stars=i>n?(2*n-i):i;
            for (int j = 1; j <= bef_spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    } 

    public static void main(String[] args) {
        // pattern_12_easy(5);
        // pattern_13(5);
        // pattern_13(5);
        Patter28_official(5);
    }
}
