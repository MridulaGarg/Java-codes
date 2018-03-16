import java.io.*;

public class Encrypt
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f1 = new FileInputStream(args[0]);
			FileOutputStream f2 = new FileOutputStream(args[1]);

			int a = 0;
			int b = 0xFF;
			int c;
			while((a = f1.read()) != -1)
			{
				c = a ^ b;
				f2.write((char)c);
			}

			f1.close();
			f2.close();

			f1 = new FileInputStream(args[1]);
			while((a = f1.read()) != -1)
			{
				c = a ^ b;
				System.out.print((char)c);
			}
			f1.close();
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
