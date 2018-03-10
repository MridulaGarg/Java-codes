import java.util.LinkedList;

public class PrimeNumber
{
    private LinkedList<Integer> list;

    public PrimeNumber(int k)
    {
        list = new LinkedList<Integer>();

        int count = 0;
        int i;
        int num = 2;
        int flag = 0;

        do
        {
            //generating prime number
            for(i = 2 ; i <= Math.sqrt(num) ; i++)
            {
                if(num % i == 0)
                {
                    flag = 1;
                    break;
                }
            }

            //adding number to the list
            if(flag == 0)
            {
                list.add(num);
                count++;
            }
            else
                flag = 0;

            num++;
        }while(count < k && num <= 10000);

        //prime numbers upto 10000 are considered only
        if(num > 10000)
            System.out.println("Limit exceeded...(prime numbers >10000 can't be generated)");
    }

    public LinkedList<Integer> getList()
    {
        return list;
    }
}
