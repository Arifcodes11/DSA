import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        int i=2;

        while(i<n){
            if(n%i==0){
                System.out.println("not prime for" +i);
            }
            else{
                System.out.println("prime for " + i);
            }
            i++;
        }
    }
}
