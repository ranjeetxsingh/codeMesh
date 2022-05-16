/* 
 
HOLLOW BUTTERFLY

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *




*/



class pattern8 {

    static void print(int n) {
        for (int i = 1; i <= n - 2; i++) {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            
            for(int j = 1; j <= 10; j++){
                if( ((j == 1) || (j == 10))){
                    System.out.print("*");
                }
                else if((i == 1 ) || (i == 10)){
                    System.out.print(" ");
                }
                else{
                    if(j < i &&  i<=5){
                        System.out.print(" ");
                    }
                    else if( (j == i) || (j == (10-i+1))  ){
                        System.out.print("*");
                        
                    }
                    else {
                        System.out.print(" ");
                    }
                    
                } 
            }
            System.out.println();
                
            }
              
    }
}
