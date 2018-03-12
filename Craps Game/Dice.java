import java.util.Random;

public class Dice
{
    public int fValue;

    public Dice()
    {
	this.fValue = 0;
    }

    public void roll()
    {
	Random obj = new Random();
	fValue = 1 + obj.nextInt(6);
    }
}
