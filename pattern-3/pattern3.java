/* 

pattern to be printed :-

10 9 8 7
 6 5 4 
  3 2 
   1


*/

class pattern3 {
    public static void main(String[] args) {
        
        int counter = 10;

        for (int i = 0; i < 4; i++) {
            //inner-loop to print spaces;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // inner-loop to print numbers
            for(int j = 4; j > i; j--){
                System.out.print(counter + " ");
                counter--;
            }

            System.out.println();
        }

    }
}
