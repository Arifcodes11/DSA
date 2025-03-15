import java.util.Scanner;

public class sumofN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first" + n + "natural number is :" + sum);
    }
}