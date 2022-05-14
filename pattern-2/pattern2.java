/*

pattern to be printed :- 

A B C
A B
A
A B
A B C
A B
A
A B 
A B C


*/


class pattern2 {
    public static void main(String[] args) {
        
        String s = "ABC";
        
        // first part 
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        // second part

        for (int i = 2; i <= 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        // third part
        for (int i = 2; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }

        //fourth part
        for (int i = 2; i <= 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }


    }
}
