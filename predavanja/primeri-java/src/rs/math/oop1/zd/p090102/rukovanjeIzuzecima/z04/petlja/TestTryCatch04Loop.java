package rs.math.oop1.zd.p090102.rukovanjeIzuzecima.z04.petlja;

public class TestTryCatch04Loop
{
	public static void main( String[] args )
	{
		try
		{
			int i = 12;			
			System.out.println( "for loop entered." );
			for (int j = 3; j >= -2; j--)
			{
				System.out.println( "Loop entered " + "i = " + i + " j = " + j );
				System.out.println( i / j ); // Divide by 0 - exception thrown
			}
			System.out.println( "Ending for loop" );
		}
		catch (ArithmeticException e)
		{ // Catch the exception
			System.out.println( "Arithmetic exception caught" );
		}
		System.out.println( "After try/catch " );
	}
}
