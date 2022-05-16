/* 

   1
  212
 32123
43211234
 32123
  212
   1     

*/


class pattern5 {
    public static void main(String[] args) {

        //upper traingle

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > i; j--) { // loop to print spaces
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) { //loop to print numbers
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        //lower triangle
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= 4 - i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}

