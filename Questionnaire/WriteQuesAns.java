import java.io.*;
import java.util.Scanner;

public class WriteQuesAns
{
	public static void main(String[] args)
	{
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("input.ser"));
			Scanner scan = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			String q;
			boolean a;
			int x;
			Questionnaire obj;
		
			do
			{	
				System.out.print("\nEnter question : ");
				q = scan.nextLine();
				System.out.print("\nEnter answer(TRUE/FALSE) : ");
				a = sc.nextBoolean();
			
				obj = new Questionnaire(q, a);
				out.writeObject(obj);
				
				System.out.print("Want to add more questions(press -1 for no) : ");
				x= sc.nextInt();
			}while(x != -1);
	
			if(out != null)
				out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}