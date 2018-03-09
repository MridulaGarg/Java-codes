import java.util.LinkedList;
import java.util.ListIterator;

public class Array
{
    private int s;
    private LinkedList<Integer>[] ll = new LinkedList[10];
    private int max;
    private int length;

    public Array(int size)
    {
        s = size;
        length = 0;
        for(int i = 0 ; i < 10 ; i++)
            ll[i] = new LinkedList<Integer>();
    }

    //function to obtain maximum element from the array
    public int Max(int[] arr)
    {
        max = arr[0];
        for(int i = 1; i < s ; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    //function to obtain number of digits in the maximum element
    private int Length(int[] arr)
    {
        max = Max(arr);
        int temp = max;

        while(temp != 0)
        {
            temp = temp / 10;
            length++;
        }
        return length;
    }

    //final sorting function using radix sort(with the help of array of 10 LinkedList)
    public int[] sort(int[] arr) {
        int t = 1;
        int i, j, k, temp;
        ListIterator<Integer> itr;
        length = Length(arr);

        //Loop must execute till the length
        for(i = 0 ; i < length ; i++)
        {
            //placing the elements in the Linkedlist
            for(k = 0 ; k < s ; k++)
            {
                temp = arr[k] / t;
                j = temp % 10;
                ll[j].add(arr[k]);
            }
            t = t * 10;
            j = 0;

            //fetching the elements from the list and updating the array
            for(k = 0 ; k < 10 ; k++)
            {
                itr = ll[k].listIterator(0);
                while(itr.hasNext() == true)
                {
                    arr[j++] = itr.next();
                    itr.remove();
                }
            }
            System.out.println("Array after " + (i+1) + "th iteration :" + this.toString(arr));
        }
        return arr;
    }

    public String toString(int[] arr)
    {
        String str = " ";

        for(int i = 0 ; i < s ; i++)
        {
            if(i != s-1)
                str += arr[i] + " , ";
            else
                str += arr[i];
        }

        return str;
    }
}