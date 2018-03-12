public class MySet
{
    private int elements[];

    public MySet()
    {
	this.elements = new int[0];
    }

    public MySet(int[] b)
    {
	this();
	int c = getCardinality(b);
	this.elements = new int[c];

	int i, k;
	int j = 0;
	boolean flag = false;

	for(i = 0 ; i < b.length ; i++)
	{
	    for(k = 0 ; k < i ; k++)
	    {
		if(b[i] == b[k])
		    flag = true;
	    }
	    if(!flag)
	    	this.elements[j++] = b[i];
	    else
		flag = false;
	}
    }

    public int getCardinality(int[] b)
    {
	int c = 0;
	boolean flag = false;

	for(int i = 0 ; i < b.length ; i++)
	{
	    for(int k = 0 ; k < i ; k++)
	    {
		if(b[i] == b[k])
		    flag = true;
	    }
	    if(!flag)
		c++;
            else
		flag = false;
	}

	return c;
    }


    public boolean isElementInTheSet(int val)
    {
	for(int i = 0 ; i < this.elements.length ; i++)
	{
	    if(this.elements[i] == val)
		return true;
	}

	return false;
    }

    public MySet Union(MySet ob)
    {
	int size = getCardinality(this.elements) + getCardinality(ob.elements);
	int[] a = new int[size];
	int i;
	int k = 0;

	for(i = 0 ; i < this.elements.length ; i++)
	    a[k++] = this.elements[i];

	for(i = 0 ; i < ob.elements.length ; i++)
	    a[k++] = ob.elements[i];

	MySet union = new MySet(a);

	return union;
    }

    public String toString()
    {
	String str = "{";
	int i;

	for(i = 0 ; i < this.elements.length-1 ; i++)
	    str = str + this.elements[i] + ", ";

	str = str + this.elements[i] + "}";

	return str;
    }
}
