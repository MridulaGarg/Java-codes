public class CTest
{
    public static void main(String[] args)
    {
	CrapsGame g;
	int res, i;
	int[] cwon = new int[11];
	int[] clost = new int[11];

	for(i = 0 ; i < 11 ; i++)
	{
	    cwon[i] = 0;
	    clost[i] = 0;
	}

	for(i = 0 ; i < 1000 ; i++)
	{
	    g = new CrapsGame();
	    //System.out.println(i);
	    res = g.play();
	    //System.out.println(res);
	    int t = res % 10;
	    res = res / 10;

	    if(res <= 10)
	    {
		if(t == 1)
		    cwon[res-1]++;
		else if(t == 0)
		    clost[res-1]++;
	    }
	    else
	    {
		if(t == 1)
		    cwon[10]++;
		else if(t == 0)
		    clost[10]++;
	    }
	}

	System.out.println("Round\tWon\tLost");
	for(i = 0 ; i < 11 ; i++)
	    System.out.println( (i+1) + "\t" + cwon[i] + "\t" + clost[i] );
    }
}
