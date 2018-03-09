import java.util.Scanner;

public class TestArrSort {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        if(size <= 0)
        {
            System.out.println("Size must be >0...");
            return;
        }

        int[] a = new int[size];

        System.out.println("\nEnter elements of array...");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print("\nElement " + (i+1) + " : ");
            a[i] = scan.nextInt();
        }

        Array array = new Array(size);
        a = array.sort(a);

        System.out.print("\nArray after sorting is : " + array.toString(a));
    }
}
