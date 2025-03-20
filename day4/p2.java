package Git.day4;

import java.util.Scanner;

public class p2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int noOfRows=sc.nextInt();

        for(int row=1;row<=noOfRows;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}