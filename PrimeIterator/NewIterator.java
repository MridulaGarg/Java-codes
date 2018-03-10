import java.util.LinkedList;

public class NewIterator
{
    private LinkedList<Integer> ll;
    private int index;

    public NewIterator(LinkedList<Integer> list)
    {
        ll = list;
        index = 0;
    }

    public boolean hasNext()
    {
        if(index < ll.size())
            return true;

        return false;
    }

    public Integer next()
    {
        return ll.get(index++);
    }
}
