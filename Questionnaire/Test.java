import java.io.*;
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		int score = 0;
		
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("input.ser"));
			Scanner scan = new Scanner(System.in);
			boolean x;
			Questionnaire ar = (Questionnaire) in.readObject();
			
			while(ar != null)
			{				
				System.out.println("\nQuestion : " + ar.getQues());
				System.out.print("Answer : ");
				x = scan.nextBoolean();
				
				if(x == ar.getAns())
					score++;
				
				ar = (Questionnaire) in.readObject();
			}				
			
			in.close();
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Invalid class object...");
		}
		catch(EOFException eof)
		{
			System.out.println("Your score is : " + score);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}