package rs.math.oop1.zd.p060300.klaseObjektiPolja.z02.geometrija;

class Tacka {
   double x;
   double y;
   String oznaka;

   void init(String o, double xKoord, double yKoord) {
      oznaka = o;
      x = xKoord;
      y = yKoord;
   }

   void prikaziSe(boolean bezOznake) {
      if (!bezOznake)
         System.out.print(oznaka + "(" + x + "," + y + ")");
      else
         System.out.print("(" + x + "," + y + ")");
   }

}
