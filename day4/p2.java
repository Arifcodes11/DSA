package Git.day4;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows and columns : ");
        int noOfRows = sc.nextInt();
        int noOfCols = sc.nextInt();

        for(int rows = 1;rows <=noOfRows;rows++ )
        {
            for(int cols = 1;cols<=rows;cols++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
