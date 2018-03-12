//import java.lang.*;

public class MySetTest
{
    public static void main(String[] args)
    {
	int[] p = {1,2,5,8,3,6,2,7,8};

	MySet S1 = new MySet(p);

	int[] q = {3,8,2,9,1,7,5,10};

	MySet S2 = new MySet(q);

	System.out.println(S1 + " U " + S2 + " = " + S1.Union(S2));



	System.out.println("\n20 is present in " + S1.Union(S2) + " : " + (S1.Union(S2)).isElementInTheSet(20));
    }
}
