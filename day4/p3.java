package Git.day4;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows for the pattern : ");
        int noOfrows=sc.nextInt();

        for(int row=1;row<=noOfrows;row++)
        {
            for(int col=noOfrows-row+1;col>=1;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Enter the Number of Rows for the pattern : 5
// * * * * * 
// * * * *
// * * *
// * *
// *
