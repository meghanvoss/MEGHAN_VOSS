public class Lesson_05boolean
{
	public static void main(String[]args)
	{
		boolean tOrF = true;
		
		if(tOrF())
		{
			System.out.println("It is true!");
		}
		
		if(!tOrF())
		{
			System.out.println("It is false!");
		}
	}
	
	public static boolean tOrF()
	{
		return 8 >= 5;
	}
}