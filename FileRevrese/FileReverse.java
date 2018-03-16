import java.io.*;

import java.util.*;



public class FileReverse

{

	public static void main(String[] args)

	{
		try

		{

			FileReader f1 = new FileReader(args[0]);

			Scanner in = new Scanner(f1);

			FileWriter f2 = new FileWriter(args[1]);

			String str, s;

			StringTokenizer t;

			Formatter f = new Formatter(f2);


			while(in.hasNext())

			{

				s = " ";
				str = in.nextLine();

				t = new StringTokenizer(str);

				while(t.hasMoreTokens())

					s = t.nextToken() + " " + s;
				f.format("%s\n", s);

			}

			f.close();

			f1.close();

			f2.close();

		}


		catch(IOException e)

		{

			e.printStackTrace();

		}

	}

}
