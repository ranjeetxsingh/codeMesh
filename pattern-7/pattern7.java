import java.util.Scanner;

/* 

          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1



*/

class pattern7 {
    
    static int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter height of pascal triangle");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {

                // for left spacing
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                // nCr formula
                System.out.print(" " + ((factorial(i)) / (factorial(i - j) * factorial(j))));
            }
            // for newline
            System.out.println();
        }

    }

}
