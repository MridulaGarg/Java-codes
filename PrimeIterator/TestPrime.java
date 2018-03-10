import java.util.Scanner;

public class TestPrime
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the no. of primes to be generated : ");
        int k = scan.nextInt();

        if(k <= 0)
        {
            System.out.println("Number must be >0...");
            return;
        }

        PrimeNumber prime = new PrimeNumber(k);

        NewIterator itr = new NewIterator(prime.getList());

        while(itr.hasNext() == true)
        {
            System.out.print(itr.next() + "\t");
        }
    }
}
