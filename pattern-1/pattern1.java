/* Pattern to be printed is :-

# # # # #
# * * *
# * *
# *
#
# *
# * *
# * * *
# # # # #


*/

class pattern1 {
    public static void main(String[] args) {
        // printing upper triangle

        for (int i = 5; i > 0; i--) { // outer for-loop

            if (i == 5 || i == 1) { // if-condition to print only '#' in i = 1 and i = 5 line

                for (int j = 0; j < i; j++) { // inner for-loop
                    System.out.print("# "); // printing ''
                }

            } else { // else-condition priting remaining i = 2, 3, 4 line

                for (int j = 0; j < i; j++) { // inner for-loop

                    if (j == 0) { // if condition to print '#' in first-place of line = 2, 3, 4
                        System.out.print("# ");
                    } else { // else to print '*' in remaining J places
                        System.out.print("* ");
                    }

                }
            }

            System.out.println(); // print statement to change line
        }
        
        // printing lower triangle

        for (int i = 2; i <= 5; i++) { // outer for-loop

            if (i == 5 || i == 1) { // if-condition to print only '#' in i = 1 and i = 5 line

                for (int j = 0; j < i; j++) { // inner for-loop
                    System.out.print("# "); // printing ''
                }

            } else { // else-condition priting remaining i = 2, 3, 4 line

                for (int j = 0; j < i; j++) { // inner for-loop

                    if (j == 0) { // if condition to print '#' in first-place of line = 2, 3, 4
                        System.out.print("# ");
                    } else { // else to print '*' in remaining J places
                        System.out.print("* ");
                    }

                }
            }

            System.out.println(); // print statement to change line
        }


    }
}