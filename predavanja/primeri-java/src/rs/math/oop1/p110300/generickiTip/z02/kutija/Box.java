package rs.math.oop1.p110300.generickiTip.z02.kutija;

public class Box<T>
{
	private T uKutiji;
	
	public void set( T uKutiji )
	{
		this.uKutiji = uKutiji;
	}
	
	public T get()
	{
		return uKutiji;
	}
}