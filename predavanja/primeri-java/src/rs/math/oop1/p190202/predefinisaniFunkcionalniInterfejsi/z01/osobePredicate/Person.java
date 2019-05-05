package rs.math.oop1.p190202.predefinisaniFunkcionalniInterfejsi.z01.osobePredicate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Person
{
	
	public static List<Person> LJUDI;
	
	static
	{
		LJUDI = new ArrayList<>();
		LJUDI.add( new Person( "Miki Maus", LocalDate.of( 1928, 5, 7 ), Sex.MALE,
				"mickey.mouse@disney.com" ) );
		LJUDI.add( new Person( "Paja Patak", LocalDate.of( 1932, 5, 7 ), Sex.MALE,
				"donald.duck@disney.com" ) );
		LJUDI.add( new Person( "Dusko Dugousko", LocalDate.of( 1932, 5, 7 ), Sex.MALE,
				"bugs.buney@wb.com" ) );
		LJUDI.add( new Person( "Mini Maus", LocalDate.of( 1929, 5, 7 ), Sex.FEMALE,
				"miney.mouse@disney.com" ) );
		LJUDI.add( new Person( "Silja", LocalDate.of( 1940, 5, 7 ), Sex.MALE,
				"guffy@disney.com" ) );
		LJUDI.add( new Person( "Patak Daca", LocalDate.of( 1945, 5, 7 ), Sex.MALE,
				"duffy.duck@wb.com" ) );
	}
	
	public Person( String name, LocalDate birthday, Sex gender,
			String emailAddress )
	{
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}
	
	public enum Sex
	{
		MALE, FEMALE
	}
	
	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	
	public long getAge()
	{
		return birthday.until( LocalDate.now(), ChronoUnit.YEARS);
	}
	
	@Override
	public String toString()
	{
		return name + " " + gender + " " + birthday + " " +  getAge() + " "  + emailAddress;
	}
	
	public void printPerson()
	{
		System.out.println( this );
	}
}