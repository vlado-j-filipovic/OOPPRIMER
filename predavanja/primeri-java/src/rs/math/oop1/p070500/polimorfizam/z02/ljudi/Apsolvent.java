package rs.math.oop1.p070500.polimorfizam.z02.ljudi;

public class Apsolvent extends Student
{
  int brojRokovaDoIstekaStaza;
  
  void predstaviSe()
  {
    System.out.println("Apsolvent: " 
      + ime + " " + prezime + " " 
      + smer +" " + brojIndeksa + " "
      + godinaStudija 
      + brojRokovaDoIstekaStaza + "." + jeDobar());
  }
}
