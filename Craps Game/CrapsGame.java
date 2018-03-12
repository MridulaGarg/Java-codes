public class CrapsGame
{
    private Dice d1;
    private Dice d2;
    private int sum;
    private int p;
    private int flag;
    private int round;

    public CrapsGame()
    {
	d1 = new Dice();
	d2 = new Dice();
	sum = 0;
	p = 0;
	flag = -1;
	round = 0;
    }

    public int play()
    {
	++round;
	d1.roll();
	d2.roll();

	sum = d1.fValue + d2.fValue;

	if(sum == 7 || sum == 11)
	{
	 //   System.out.println("User wins  " + round);
	    flag = 1;
	}
	else if(sum == 2 || sum == 3 || sum ==12)
	{
	   // System.out.println("Computer wins  " + round);
	    flag = 0;
	}
	else
	    p = sum;

	while(flag == -1)
	{
	    ++round;
	    d1.roll();
	    d2.roll();
	    sum = d1.fValue + d2.fValue;

	    if(sum == p)
	    {
		//System.out.println("User wins  " + round);
		flag = 1;
	    }
	    else if(sum == 7)
	    {
		//System.out.println("Computer wins  " + round);
		flag = 0;
	    }
	}

	return ((round*10)+flag);
    }
}
