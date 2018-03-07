import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy
{
	public static void main(String[] args)
	{
		try
		{
			FileReader f = new FileReader(args[0]);
			Scanner in = new Scanner(f);
			FileWriter fw = new FileWriter(args[1]);

			while(in.hasNextLine())
			{
				String s = in.nextLine() + "\n";
				fw.write(s);
			}
		
			fw.close();
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
