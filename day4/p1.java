package Git.day4;

import java.util.Scanner;

public class p1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of rows and colums : ");
        int noOfRows=sc.nextInt();
        int noOfCol=sc.nextInt();

        for(int row=1;row<=noOfRows;row++)
        {
            for(int col=1;col<=noOfCol;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
