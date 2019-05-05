
package rs.math.oop1.p170100.datotekeDirektorijumi.z01.listanje;

import java.io.File;
import java.util.Arrays;

public class ListHiddenFiles
{
	public static void main( String[] args )
	{
		
		final File[] files = new File( "." ).listFiles( file -> file.isHidden() );
		
		new File( "." ).listFiles( File::isHidden );
		
		Arrays.stream( files ).forEach( System.out::println );
	}
}