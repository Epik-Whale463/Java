import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

       /* for (int i =10; i>=0;i--) {
            System.out.println(i);
        }
        System.out.println("Happy new year !!");

 */
        Scanner scanner  = new Scanner(System.in);
        int rows, cols;
        String symbol = "";

        System.out.println("Enter the number of rows : ");
        rows  = scanner.nextInt();
        System.out.println("Enter the number of columns : ");
        cols  = scanner.nextInt();
        System.out.println("Enter symbol to use : ");
        symbol = scanner.next();

        // loop logic

        for (int i = 1; i <= rows; i++) {
            System.out.println();

            for(int j =1; j<=cols ;j++) {
                    System.out.print(symbol);
            }
        }
        
        scanner.close();

    }
}
