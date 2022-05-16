/* 
    Pattern :-
    
        *
       * * 
      *   *
     *     * 
    *********


*/


public class pattern4 {
    public static void main(String[] args) {
        int counter = 4; 
        for (int i = 1; i <= 5; i++) {
            
            if (i == 1) {
                for (int j = 1; j <= counter; j++) {
                    System.out.print(" ");
                }
                counter--;
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if (i == 5) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j = 1; j <= counter; j++) {
                    System.out.print(" ");
                }
                counter--;
                for (int j = 1; j <= 2 * i; j++) {
                    if ((j == 1) || (j == (2 * i - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                
            }
        }
    }
} 
