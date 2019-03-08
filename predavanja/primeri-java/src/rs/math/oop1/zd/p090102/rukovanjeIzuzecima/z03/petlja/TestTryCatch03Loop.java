package rs.math.oop1.zd.p090102.rukovanjeIzuzecima.z03.petlja;

public class TestTryCatch03Loop
{
	public static void main( String[] args )
	{
		int i = 12;
		
		for (int j = 3; j >= -2; j--)
		{
			try
			{
				System.out.println( "Try block entered " + "i = " + i + " j = " + j );
				System.out.println( i / j ); // Divide by 0 - exception thrown
				System.out.println( "Ending try block" );				
			}
			catch (ArithmeticException e)
			{ // Catch the exception
				System.out.println( "Arithmetic exception caught " );
			}
			System.out.println( "After try block" );
		}
		System.out.println( "After for loop" );		
		return;
	}
}
