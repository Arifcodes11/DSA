import java.util.Scanner;

public class conditions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        sc.close();

        System.out.println("Enter the number: "+a);
        if(a>0){
            System.out.println("postitive number");
        }
        else if(a<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("zero");
        }

    }
}