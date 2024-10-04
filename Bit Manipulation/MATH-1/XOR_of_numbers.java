/*                            XOR TILL
    A                         steps                          XOR From 0 to A

    0                                                                0
    1                            0^1                                 1
    2              1   ^ 2       0^1^2                               3
    3              3   ^ 3       0^1^2^3                             0
    4              0   ^ 4       0^1^2^3^4                           4
    5              4   ^ 5       0^1^2^3^4^5                         1
    6              1   ^ 6       0^1^2^3^4^5^6                       7
    7              7   ^ 7       0^1^2^3^4^5^6^7                     0
    8              0   ^ 8       0^1^2^3^4^5^6^7^8                   8
    
  Answer:-
   a % 4 = 0     a
   a % 4 = 1     1
   a % 4 = 2    a+1
   a % 4 = 3     0

.                             XOR OF RANGE

    XOR from 3 till 9 == (XOR_till(9)) - (XOR_till(3)) 
 */
public class XOR_of_numbers {
    public static int XOR_til(int num){
        if (num%4 ==0) {
            return num;
        }else if (num%4==1) {
            return 1;
        }else if (num%4==2) {
            return num+1;
        }else if (num%4 ==3) {
            return 0;
        }
        return -1;
    }

    public static int XOR_range(int start , int end){
        int ans =0;
        ans = XOR_til(end) ^ XOR_til(start-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(XOR_til(5));
        System.out.println(XOR_range(3, 9));
    }
}
