package rs.math.oop1.z100103.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

public class ArgumentJeNullException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: argument je null, sto nije dopusteno. " + s;
	}
}
