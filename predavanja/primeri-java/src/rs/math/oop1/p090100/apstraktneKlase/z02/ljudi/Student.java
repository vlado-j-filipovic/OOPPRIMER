package rs.math.oop1.p090100.apstraktneKlase.z02.ljudi;

class Student extends Covek
{
  String smer;
  String brojIndeksa;
  int godinaStudija;

  void predstaviSe()
  {
    System.out.println("Student: " 
      + ime + " " + prezime + " " 
      + smer +" " + brojIndeksa + " "
      + godinaStudija + ".");
  }
}