package rs.math.oop1.p130602.strukturisanjePodataka.z01.samorastuciNiz;

public class SamorastuciNizTest
{
	
	public static void main( String[] args )
	{
		SamorastuciNiz<Integer> niz = new SamorastuciNiz<>();
		for(int i =0; i<200; i++) {
			niz.postaviNaPoziciju(3 * (i + 1), i);
			System.out.println(niz);
		}
		niz.postaviNaPoziciju(-1,1000);
		System.out.println(niz);
		niz.postaviNaPoziciju(-1,-1);
	}
	
}
